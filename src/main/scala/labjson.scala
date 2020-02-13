import labjson.PRETTY_PRINT_IDENT_FACTOR
import org.json.{JSONException, XML};




object labjson extends App{

  val PRETTY_PRINT_IDENT_FACTOR = 4
  def convert(xml: String)={
    try{
      println(xml)
      val jsonobject = XML.toJSONObject(xml)
      val jsonPretty = jsonobject.toString(PRETTY_PRINT_IDENT_FACTOR)
      println(jsonPretty)
    } catch{
        case e: JSONException =>  println(e.toString)
    }
  }

  val XML_STRING =
    """
      |<?xml version="1.0" encoding="UTF-8"?>
      |<menu_desayuno>
      |        <opcion>
      |            <nombre>Panckages</nombre>
      |            <valor>$2.95</valor>
      |            <descripcion>Lithuanian Panckage Recipe</descripcion>
      |            <kcal>500</kcal>
      |        </opcion>
      |        <opcion>
      |            <nombre>Belgian Wafles</nombre>
      |            <valor>$5.95</valor>
      |            <descripcion>Two of our famous Belgian Waffles with plenty of real maple syrup</descripcion>
      |            <kcal>600</kcal>
      |        </opcion>
      |        <opcion>
      |          <nombre>Strawberry Belgian Waffles</nombre>
      |          <valor>$7.95</valor>
      |          <descripcion>Light Belgian Wafles covered with strawberries and whiped cream</descripcion>
      |          <kcal>900</kcal>
      |        </opcion>
      |</menu_desayuno>
      |""".stripMargin

  val XML_STRING2 =
    """
      |<?xml version="1.0" encoding="UTF-8" ?>
      |<CATALOG>
      |	<CD>
      |		<TITLE>Empire Burlesque</TITLE>
      |		<ARTIST>Bob Dylan</ARTIST>
      |		<COUNTRY>USA</COUNTRY>
      |		<COMPANY>Columbia</COMPANY>
      |		<PRICE>10.90</PRICE>
      |		<YEAR>1985</YEAR>
      |	</CD>
      |	<CD>
      |		<TITLE>Hide your heart</TITLE>
      |		<ARTIST>Bonnie Tyler</ARTIST>
      |		<COUNTRY>UK</COUNTRY>
      |		<COMPANY>CBS Records</COMPANY>
      |		<PRICE>9.90</PRICE>
      |		<YEAR>1988</YEAR>
      |	</CD>
      |	<CD>
      |		<TITLE>Greatest Hits</TITLE>
      |		<ARTIST>Dolly Parton</ARTIST>
      |		<COUNTRY>USA</COUNTRY>
      |		<COMPANY>RCA</COMPANY>
      |		<PRICE>9.90</PRICE>
      |		<YEAR>1982</YEAR>
      |	</CD>
      |	<CD>
      |		<TITLE>Still Got the blues</TITLE>
      |		<ARTIST>Gary Moore</ARTIST>
      |		<COUNTRY>UK</COUNTRY>
      |		<COMPANY>Virgin Records</COMPANY>
      |		<PRICE>10.20</PRICE>
      |		<YEAR>1990</YEAR>
      |	</CD>
      |	<CD>
      |		<TITLE>Peaceful Warrior</TITLE>
      |		<ARTIST>Kevin Bernhardt</ARTIST>
      |		<COUNTRY>USA</COUNTRY>
      |		<COMPANY>DEJ Productions</COMPANY>
      |		<PRICE>10.20</PRICE>
      |		<YEAR>2006</YEAR>
      |	</CD>
      |	<CD>
      |		<TITLE>Avatar</TITLE>
      |		<ARTIST>Sam Worthington</ARTIST>
      |		<COUNTRY>USA</COUNTRY>
      |		<COMPANY>Lightstorm</COMPANY>
      |		<PRICE>11.30</PRICE>
      |		<YEAR>2009</YEAR>
      |	</CD>
      |</CATALOG>
      |""".stripMargin

  convert(XML_STRING)
  convert(XML_STRING2)

}

