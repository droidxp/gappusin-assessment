public class org.anddev.andengine.util.SAXUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.SAXUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, Object p2 ) {
		 /* .locals 1 */
		 java.lang.String .valueOf ( p2 );
		 org.anddev.andengine.util.SAXUtils .appendAttribute ( p0,p1,v0 );
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, Double p2 ) {
		 /* .locals 1 */
		 java.lang.String .valueOf ( p2,p3 );
		 org.anddev.andengine.util.SAXUtils .appendAttribute ( p0,p1,v0 );
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, Float p2 ) {
		 /* .locals 1 */
		 java.lang.String .valueOf ( p2 );
		 org.anddev.andengine.util.SAXUtils .appendAttribute ( p0,p1,v0 );
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 1 */
		 java.lang.String .valueOf ( p2 );
		 org.anddev.andengine.util.SAXUtils .appendAttribute ( p0,p1,v0 );
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, Long p2 ) {
		 /* .locals 1 */
		 java.lang.String .valueOf ( p2,p3 );
		 org.anddev.andengine.util.SAXUtils .appendAttribute ( p0,p1,v0 );
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 3 */
		 /* const/16 v2, 0x22 */
		 /* const/16 v0, 0x20 */
		 (( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* const/16 v1, 0x3d */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, Object p2 ) {
		 /* .locals 1 */
		 java.lang.String .valueOf ( p2 );
		 org.anddev.andengine.util.SAXUtils .appendAttribute ( p0,p1,v0 );
		 return;
	 } // .end method
	 public static void appendAttribute ( java.lang.StringBuilder p0, java.lang.String p1, Boolean p2 ) {
		 /* .locals 1 */
		 java.lang.String .valueOf ( p2 );
		 org.anddev.andengine.util.SAXUtils .appendAttribute ( p0,p1,v0 );
		 return;
	 } // .end method
	 public static java.lang.String getAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 /* move-object v0, p2 */
} // .end method
public static java.lang.String getAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 final String v0 = ""; // const-string v0, ""
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "No value found for attribute: \'"; // const-string v2, "No value found for attribute: \'"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\'"; // const-string v2, "\'"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public static Boolean getBooleanAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, Boolean p2 ) {
	 /* .locals 1 */
	 final String v0 = ""; // const-string v0, ""
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 java.lang.Boolean .parseBoolean ( v0 );
	 } // :goto_0
} // :cond_0
/* move v0, p2 */
} // .end method
public static Boolean getBooleanAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
/* .locals 1 */
org.anddev.andengine.util.SAXUtils .getAttributeOrThrow ( p0,p1 );
v0 = java.lang.Boolean .parseBoolean ( v0 );
} // .end method
public static Object getByteAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, Object p2 ) {
/* .locals 1 */
final String v0 = ""; // const-string v0, ""
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 java.lang.Byte .parseByte ( v0 );
} // :goto_0
} // :cond_0
/* move v0, p2 */
} // .end method
public static Object getByteAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
/* .locals 1 */
org.anddev.andengine.util.SAXUtils .getAttributeOrThrow ( p0,p1 );
v0 = java.lang.Byte .parseByte ( v0 );
} // .end method
public static Double getDoubleAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, Double p2 ) {
/* .locals 2 */
final String v0 = ""; // const-string v0, ""
if ( v0 != null) { // if-eqz v0, :cond_0
java.lang.Double .parseDouble ( v0 );
/* move-result-wide v0 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
/* move-wide v0, p2 */
} // .end method
public static Double getDoubleAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
/* .locals 2 */
org.anddev.andengine.util.SAXUtils .getAttributeOrThrow ( p0,p1 );
java.lang.Double .parseDouble ( v0 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static Float getFloatAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, Float p2 ) {
/* .locals 1 */
final String v0 = ""; // const-string v0, ""
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = java.lang.Float .parseFloat ( v0 );
} // :goto_0
} // :cond_0
/* move v0, p2 */
} // .end method
public static Float getFloatAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
/* .locals 1 */
org.anddev.andengine.util.SAXUtils .getAttributeOrThrow ( p0,p1 );
v0 = java.lang.Float .parseFloat ( v0 );
} // .end method
public static Integer getIntAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, Integer p2 ) {
/* .locals 1 */
final String v0 = ""; // const-string v0, ""
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = java.lang.Integer .parseInt ( v0 );
} // :goto_0
} // :cond_0
/* move v0, p2 */
} // .end method
public static Integer getIntAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
/* .locals 1 */
org.anddev.andengine.util.SAXUtils .getAttributeOrThrow ( p0,p1 );
v0 = java.lang.Integer .parseInt ( v0 );
} // .end method
public static Long getLongAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, Long p2 ) {
/* .locals 2 */
final String v0 = ""; // const-string v0, ""
if ( v0 != null) { // if-eqz v0, :cond_0
java.lang.Long .parseLong ( v0 );
/* move-result-wide v0 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
/* move-wide v0, p2 */
} // .end method
public static Long getLongAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
/* .locals 2 */
org.anddev.andengine.util.SAXUtils .getAttributeOrThrow ( p0,p1 );
java.lang.Long .parseLong ( v0 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static Object getShortAttribute ( org.xml.sax.Attributes p0, java.lang.String p1, Object p2 ) {
/* .locals 1 */
final String v0 = ""; // const-string v0, ""
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = java.lang.Short .parseShort ( v0 );
} // :goto_0
} // :cond_0
/* move v0, p2 */
} // .end method
public static Object getShortAttributeOrThrow ( org.xml.sax.Attributes p0, java.lang.String p1 ) {
/* .locals 1 */
org.anddev.andengine.util.SAXUtils .getAttributeOrThrow ( p0,p1 );
v0 = java.lang.Short .parseShort ( v0 );
} // .end method
