import com.xgl.parser.xgl._

object test {
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
 
</WORLD>                                          //> xml  : scala.xml.Elem = <WORLD>
                                                  //|  
                                                  //|   <BACKGROUND>
                                                  //|     <BACKCOLOR> 0.1, 0.1, 0.1 </BACKCOLOR>
                                                  //|   </BACKGROUND>
                                                  //|  
                                                  //|   <LIGHTING>
                                                  //|     <AMBIENT> 0.2, 0.1, 0.1 </AMBIENT>
                                                  //|     <DIRECTIONALLIGHT>
                                                  //|       <DIFFUSE> 0.1, 0.2, 0.1 </DIFFUSE>
                                                  //|       <DIRECTION> 0, 0, 100 </DIRECTION>
                                                  //|       <SPECULAR> 0.1, 0.1, 0.2 </SPECULAR>
                                                  //|     </DIRECTIONALLIGHT>
                                                  //|   </LIGHTING>
                                                  //|  
                                                  //|   <MESH ID="0">
                                                  //|  
                                                  //|     <P ID="0"> -0.5, -0.5, 1 </P>
                                                  //|     <P ID="1"> 0.5, -0.5, 1 </P>
                                                  //|     <P ID="2"> 0.5, 0.5, 1 </P>
                                                  //|     <P ID="3"> -0.5, 0.5, 1 </P>
                                                  //|     <P ID="4"> 0.5, -0.5, 0 </P>
                                                  //|     <P ID="5"> -0.5, -0.5, 0 </P>
                                                  //|     <P ID="6"> -0.5, 0.5, 0 </P>
                                                  //|     <P ID="7"> 0.5, 0.5, 0 </P>
                                                  //|  
                                                  //|     <N ID="0"> -0.408248, -0.408248, 0.816497 </N>
                                                  //|     <N ID="1"> 0.666667, -0.666667, 0.333333 </N>
                                                  //|     <N ID="2"> 0.408248, 0.408248, 0.816497 </N>
                                                  //|     <N ID="3"> -0.666667, 0.666667, 0.333333 </N>
                                                  //|     <N ID="
                                                  //| Output exceeds cutoff limit.
  
val w = new World(xml)                            //> w  : com.xgl.parser.xgl.World = com.xgl.parser.xgl.World@17e6a96
 
w.mesh.faces(0).vertex3.position                  //> res0: com.xgl.parser.xgl.Position = (0.5, 0.5, 1.0)
new Position(<P ID="3"> -0.5, 0.5, 1 </P>)        //> res1: com.xgl.parser.xgl.Position = (-0.5, 0.5, 1.0)

w.objects(0).mesh.faces                           //> res2: scala.collection.immutable.Seq[com.xgl.parser.xgl.Face] = List(com.xg
                                                  //| l.parser.xgl.Face@860d49, com.xgl.parser.xgl.Face@d251a3, com.xgl.parser.xg
                                                  //| l.Face@1edc073, com.xgl.parser.xgl.Face@1f5d386, com.xgl.parser.xgl.Face@12
                                                  //| 1f1d, com.xgl.parser.xgl.Face@1b8e059, com.xgl.parser.xgl.Face@910040, com.
                                                  //| xgl.parser.xgl.Face@1a786c3, com.xgl.parser.xgl.Face@18088c0, com.xgl.parse
                                                  //| r.xgl.Face@1922221, com.xgl.parser.xgl.Face@fec107, com.xgl.parser.xgl.Face
                                                  //| @132e13d)
}