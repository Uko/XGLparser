import com.xgl.parser.xgl._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(3883); 
  val xml = <WORLD>
 
  <BACKGROUND>
    <BACKCOLOR> 0.1, 0.1, 0.1 </BACKCOLOR>
  </BACKGROUND>
 
  <LIGHTING>
    <AMBIENT> 0.2, 0.1, 0.1 </AMBIENT>
    <DIRECTIONALLIGHT>
      <DIFFUSE> 0.1, 0.2, 0.1 </DIFFUSE>
      <DIRECTION> 0, 0, 100 </DIRECTION>
      <SPECULAR> 0.1, 0.1, 0.2 </SPECULAR>
    </DIRECTIONALLIGHT>
  </LIGHTING>
 
  <MESH ID = "0">
 
    <P ID="0"> -0.5, -0.5, 1 </P>
    <P ID="1"> 0.5, -0.5, 1 </P>
    <P ID="2"> 0.5, 0.5, 1 </P>
    <P ID="3"> -0.5, 0.5, 1 </P>
    <P ID="4"> 0.5, -0.5, 0 </P>
    <P ID="5"> -0.5, -0.5, 0 </P>
    <P ID="6"> -0.5, 0.5, 0 </P>
    <P ID="7"> 0.5, 0.5, 0 </P>
 
    <N ID="0"> -0.408248, -0.408248, 0.816497 </N>
    <N ID="1"> 0.666667, -0.666667, 0.333333 </N>
    <N ID="2"> 0.408248, 0.408248, 0.816497 </N>
    <N ID="3"> -0.666667, 0.666667, 0.333333 </N>
    <N ID="4"> 0.408248, -0.408248, -0.816497 </N>
    <N ID="5"> -0.666667, -0.666667, -0.333333 </N>
    <N ID="6"> -0.408248, 0.408248, -0.816497 </N>
    <N ID="7"> 0.666667, 0.666667, -0.333333 </N>
 
    <MAT ID="0">
      <ALPHA> 0.9 </ALPHA>
      <AMB> 0.1, 0.1, 0.1 </AMB>
      <DIFF> 0.2, 0.1, 0.1 </DIFF>
      <EMISS> 0.1, 0.2, 0.1 </EMISS>
      <SHINE> 0.8 </SHINE>
      <SPEC> 0.1, 0.1, 0.2 </SPEC>
    </MAT>
 
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 0 </PREF><NREF> 0 </NREF></FV1>
      <FV2><PREF> 1 </PREF><NREF> 1 </NREF></FV2>
      <FV3><PREF> 2 </PREF><NREF> 2 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 0 </PREF><NREF> 0 </NREF></FV1>
      <FV2><PREF> 2 </PREF><NREF> 2 </NREF></FV2>
      <FV3><PREF> 3 </PREF><NREF> 3 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 4 </PREF><NREF> 4 </NREF></FV1>
      <FV2><PREF> 5 </PREF><NREF> 5 </NREF></FV2>
      <FV3><PREF> 6 </PREF><NREF> 6 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 4 </PREF><NREF> 4 </NREF></FV1>
      <FV2><PREF> 6 </PREF><NREF> 6 </NREF></FV2>
      <FV3><PREF> 7 </PREF><NREF> 7 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 5 </PREF><NREF> 5 </NREF></FV1>
      <FV2><PREF> 0 </PREF><NREF> 0 </NREF></FV2>
      <FV3><PREF> 3 </PREF><NREF> 3 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 5 </PREF><NREF> 5 </NREF></FV1>
      <FV2><PREF> 3 </PREF><NREF> 3 </NREF></FV2>
      <FV3><PREF> 6 </PREF><NREF> 6 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 1 </PREF><NREF> 1 </NREF></FV1>
      <FV2><PREF> 4 </PREF><NREF> 4 </NREF></FV2>
      <FV3><PREF> 7 </PREF><NREF> 7 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 1 </PREF><NREF> 1 </NREF></FV1>
      <FV2><PREF> 7 </PREF><NREF> 7 </NREF></FV2>
      <FV3><PREF> 2 </PREF><NREF> 2 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 5 </PREF><NREF> 5 </NREF></FV1>
      <FV2><PREF> 4 </PREF><NREF> 4 </NREF></FV2>
      <FV3><PREF> 1 </PREF><NREF> 1 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 5 </PREF><NREF> 5 </NREF></FV1>
      <FV2><PREF> 1 </PREF><NREF> 1 </NREF></FV2>
      <FV3><PREF> 0 </PREF><NREF> 0 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 3 </PREF><NREF> 3 </NREF></FV1>
      <FV2><PREF> 2 </PREF><NREF> 2 </NREF></FV2>
      <FV3><PREF> 7 </PREF><NREF> 7 </NREF></FV3>
    </F>
    <F>
      <MATREF> 0 </MATREF>
      <FV1><PREF> 3 </PREF><NREF> 3 </NREF></FV1>
      <FV2><PREF> 7 </PREF><NREF> 7 </NREF></FV2>
      <FV3><PREF> 6 </PREF><NREF> 6 </NREF></FV3>
    </F>
  </MESH>
 
  <OBJECT>
    <TRANSFORM>
      <FORWARD> 0, 0, 0 </FORWARD>
      <POSITION> 0, 0, 0 </POSITION>
      <SCALE> 1, 1, 1 </SCALE>
      <UP> 1, 1, 1 </UP>
    </TRANSFORM>
    <MESHREF> 0 </MESHREF>
  </OBJECT>

	<MESHREF> 0 </MESHREF>
 
</WORLD>;System.out.println("""xml  : scala.xml.Elem = """ + $show(xml ));$skip(26); 
  
val w = new World(xml);System.out.println("""w  : com.xgl.parser.xgl.World = """ + $show(w ));$skip(35); val res$0 = 
 
w.mesh.faces(0).vertex3.position;System.out.println("""res0: com.xgl.parser.xgl.Position = """ + $show(res$0));$skip(43); val res$1 = 
new Position(<P ID="3"> -0.5, 0.5, 1 </P>);System.out.println("""res1: com.xgl.parser.xgl.Position = """ + $show(res$1));$skip(25); val res$2 = 

w.objects(0).mesh.faces;System.out.println("""res2: scala.collection.immutable.Seq[com.xgl.parser.xgl.Face] = """ + $show(res$2))}
}
