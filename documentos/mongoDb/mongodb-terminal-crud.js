// Crear la base de datos y usar
use escuela_db

// Crear colección con validación
db.createCollection("alumnos", {
   validator: {
      $jsonSchema: {
         bsonType: "object",
         required: ["matricula", "nombre", "apellidoPaterno", "email"],
         properties: {
            matricula: {
               bsonType: "string",
               description: "debe ser string y es requerido"
            },
            nombre: {
               bsonType: "string",
               description: "debe ser string y es requerido"
            },
            apellidoPaterno: {
               bsonType: "string",
               description: "debe ser string y es requerido"
            },
            apellidoMaterno: {
               bsonType: "string",
               description: "debe ser string"
            },
            email: {
               bsonType: "string",
               pattern: "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
               description: "debe ser un email válido y es requerido"
            }
         }
      }
   }
})

// CREATE - Insertar un alumno
db.alumnos.insertOne({
    matricula: "2024A001",
    nombre: "Juan",
    apellidoPaterno: "Pérez",
    apellidoMaterno: "García",
    fechaNacimiento: new Date("2000-05-15"),
    email: "juan.perez@email.com",
    telefono: "555-0101",
    direccion: {
        calle: "Calle Principal",
        numero: "123",
        colonia: "Centro",
        ciudad: "Ciudad de México",
        codigoPostal: "12345"
    },
    estado: "Activo",
    materias: [],
    promedioGeneral: 0,
    fechaRegistro: new Date()
})

// Insertar múltiples alumnos
db.alumnos.insertMany([
    {
        matricula: "2024A002",
        nombre: "María",
        apellidoPaterno: "González",
        email: "maria.gonzalez@email.com",
        estado: "Activo",
        fechaRegistro: new Date()
    },
    {
        matricula: "2024A003",
        nombre: "Carlos",
        apellidoPaterno: "Rodríguez",
        email: "carlos.rodriguez@email.com",
        estado: "Activo",
        fechaRegistro: new Date()
    }
])

// READ - Consultas
// Obtener todos los alumnos
db.alumnos.find()

// Obtener alumnos con formato específico
db.alumnos.find().pretty()

// Buscar un alumno específico por matricula
db.alumnos.findOne({ matricula: "2024A001" })

// Buscar alumnos por estado
db.alumnos.find({ estado: "Activo" })

// Buscar usando proyección (solo ciertos campos)
db.alumnos.find(
    { estado: "Activo" },
    { matricula: 1, nombre: 1, apellidoPaterno: 1, _id: 0 }
)

// UPDATE - Actualizar registros
// Actualizar un alumno
db.alumnos.updateOne(
    { matricula: "2024A001" },
    {
        $set: {
            telefono: "555-0102",
            "direccion.colonia": "Nueva Colonia"
        }
    }
)

// Actualizar múltiples alumnos
db.alumnos.updateMany(
    { estado: "Activo" },
    {
        $set: { actualizado: new Date() }
    }
)

// Agregar una materia a un alumno
db.alumnos.updateOne(
    { matricula: "2024A001" },
    {
        $push: {
            materias: {
                nombre: "Matemáticas",
                calificacion: 8.5,
                estado: "Cursando"
            }
        }
    }
)

// DELETE - Eliminar registros
// Eliminar un alumno
db.alumnos.deleteOne({ matricula: "2024A001" })

// Eliminar múltiples alumnos
db.alumnos.deleteMany({ estado: "Baja" })

// Consultas avanzadas
// Buscar alumnos con promedio mayor a 8
db.alumnos.find({
    "materias.calificacion": { $gt: 8 }
})

// Agregar índices para mejor rendimiento
db.alumnos.createIndex({ matricula: 1 }, { unique: true })
db.alumnos.createIndex({ email: 1 }, { unique: true })
db.alumnos.createIndex({ estado: 1 })

// Consultas de agregación
// Calcular promedio general de materias por alumno
db.alumnos.aggregate([
    { $unwind: "$materias" },
    {
        $group: {
            _id: "$matricula",
            nombre: { $first: "$nombre" },
            promedioGeneral: { $avg: "$materias.calificacion" }
        }
    }
])

// Contar alumnos por estado
db.alumnos.aggregate([
    {
        $group: {
            _id: "$estado",
            total: { $sum: 1 }
        }
    }
])
