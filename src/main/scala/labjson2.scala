import org.json.{JSONException, XML,JSONArray,JSONObject};

case class Cliente(val nombre: String = "", val direccion: String = "", val telefono: String = "")
case class Vendedor(val edad: Int = 0, val nombre: String = "", val apellido: String = "", val clientes: List[Cliente])

object labjson2 extends App{

  val clientes = List(
    new Cliente(nombre = "HIVYMAR", direccion = "Victor Emilio Estrada 204", telefono = "5020800"),
    new Cliente(nombre = "PROMESA", direccion = "Via. Daule KM 5.5", telefono = "5013604"),
    new Cliente(nombre = "GLOBANT", direccion = "CALLE 10 VIZCALLA", telefono = "4014605"),
    new Cliente(nombre = "ALCUADRADO", direccion = "CAPRICENTRO ITAGUI", telefono = "3013603"))

  val vendedores = List(
    new Vendedor(edad = 10,nombre = "Juan",apellido = "Perez", clientes = clientes),
    new Vendedor(edad = 15,nombre = "Santiago",apellido = "Thompson", clientes = clientes),
    new Vendedor(edad = 20,nombre = "Augusto",apellido = "Reynolds", clientes = clientes))

  try {
      val objVendedores = new JSONArray()

      for(v <- vendedores){
        val objClientes = new JSONArray()
        for (c <- clientes) {
          val objCliente = new JSONObject()
          objCliente.put("nombre", c.nombre)
          objCliente.put("direccion", c.direccion)
          objCliente.put("telefono", c.telefono)
          objClientes.put(objCliente)
        }
        val objVendedor = new JSONObject()
        objVendedor.put("edad",v.edad)
        objVendedor.put("nombre",v.nombre)
        objVendedor.put("apellido",v.apellido)

        val objVendedorClientes = new JSONObject()
        objVendedorClientes.put("vendedor",objVendedor)
        objVendedorClientes.put("clientes",objClientes)

        objVendedores.put(objVendedorClientes)
      }
      val objVendedoresR = new JSONObject()
      objVendedoresR.put("vendedores",objVendedores)
      println(objVendedoresR)
  }
  catch {
      case e: Exception => e.printStackTrace()
  }
}


