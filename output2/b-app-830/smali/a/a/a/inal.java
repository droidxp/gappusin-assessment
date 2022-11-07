public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static java.lang.Object a ( java.io.Reader p0 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 /* new-instance v0, La/a/a/a/d; */
			 /* invoke-direct {v0}, La/a/a/a/d;-><init>()V */
			 (( a.a.a.a.d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, La/a/a/a/d;->a(Ljava/io/Reader;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public static java.lang.Object a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/io/StringReader; */
		 /* invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V */
		 a.a.a.d .a ( v0 );
	 } // .end method
	 public static java.lang.String a ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 final String v3 = "\""; // const-string v3, "\""
		 final String v2 = "null"; // const-string v2, "null"
		 /* if-nez p0, :cond_0 */
		 final String v1 = "null"; // const-string v1, "null"
		 /* move-object v1, v2 */
	 } // :goto_0
} // :cond_0
/* instance-of v1, p0, Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* new-instance v1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v2 = "\""; // const-string v2, "\""
	 (( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* check-cast p0, Ljava/lang/String; */
	 /* if-nez p0, :cond_1 */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_1
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "\""; // const-string v2, "\""
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
a.a.a.d .a ( p0,v2 );
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_2
/* instance-of v1, p0, Ljava/lang/Double; */
if ( v1 != null) { // if-eqz v1, :cond_5
/* move-object v0, p0 */
/* check-cast v0, Ljava/lang/Double; */
/* move-object v1, v0 */
v1 = (( java.lang.Double ) v1 ).isInfinite ( ); // invoke-virtual {v1}, Ljava/lang/Double;->isInfinite()Z
/* if-nez v1, :cond_3 */
/* move-object v0, p0 */
/* check-cast v0, Ljava/lang/Double; */
/* move-object v1, v0 */
v1 = (( java.lang.Double ) v1 ).isNaN ( ); // invoke-virtual {v1}, Ljava/lang/Double;->isNaN()Z
if ( v1 != null) { // if-eqz v1, :cond_4
} // :cond_3
final String v1 = "null"; // const-string v1, "null"
/* move-object v1, v2 */
} // :cond_4
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :cond_5
/* instance-of v1, p0, Ljava/lang/Float; */
if ( v1 != null) { // if-eqz v1, :cond_8
/* move-object v0, p0 */
/* check-cast v0, Ljava/lang/Float; */
/* move-object v1, v0 */
v1 = (( java.lang.Float ) v1 ).isInfinite ( ); // invoke-virtual {v1}, Ljava/lang/Float;->isInfinite()Z
/* if-nez v1, :cond_6 */
/* move-object v0, p0 */
/* check-cast v0, Ljava/lang/Float; */
/* move-object v1, v0 */
v1 = (( java.lang.Float ) v1 ).isNaN ( ); // invoke-virtual {v1}, Ljava/lang/Float;->isNaN()Z
if ( v1 != null) { // if-eqz v1, :cond_7
} // :cond_6
final String v1 = "null"; // const-string v1, "null"
/* move-object v1, v2 */
} // :cond_7
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :cond_8
/* instance-of v1, p0, Ljava/lang/Number; */
if ( v1 != null) { // if-eqz v1, :cond_9
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :cond_9
/* instance-of v1, p0, Ljava/lang/Boolean; */
if ( v1 != null) { // if-eqz v1, :cond_a
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
} // :cond_a
/* instance-of v1, p0, La/a/a/a; */
if ( v1 != null) { // if-eqz v1, :cond_b
/* check-cast p0, La/a/a/a; */
/* goto/16 :goto_0 */
} // :cond_b
/* instance-of v1, p0, Ljava/util/Map; */
if ( v1 != null) { // if-eqz v1, :cond_c
/* check-cast p0, Ljava/util/Map; */
a.a.a.c .a ( p0 );
/* goto/16 :goto_0 */
} // :cond_c
/* instance-of v1, p0, Ljava/util/List; */
if ( v1 != null) { // if-eqz v1, :cond_d
/* check-cast p0, Ljava/util/List; */
a.a.a.b .a ( p0 );
/* goto/16 :goto_0 */
} // :cond_d
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
} // .end method
static void a ( java.lang.String p0, java.lang.StringBuffer p1 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* move v0, v5 */
} // :goto_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v0, v1, :cond_5 */
v1 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* sparse-switch v1, :sswitch_data_0 */
/* if-ltz v1, :cond_0 */
/* const/16 v2, 0x1f */
/* if-le v1, v2, :cond_2 */
} // :cond_0
/* const/16 v2, 0x7f */
/* if-lt v1, v2, :cond_1 */
/* const/16 v2, 0x9f */
/* if-le v1, v2, :cond_2 */
} // :cond_1
/* const/16 v2, 0x2000 */
/* if-lt v1, v2, :cond_4 */
/* const/16 v2, 0x20ff */
/* if-gt v1, v2, :cond_4 */
} // :cond_2
java.lang.Integer .toHexString ( v1 );
final String v2 = "\\u"; // const-string v2, "\\u"
(( java.lang.StringBuffer ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* move v2, v5 */
} // :goto_1
int v3 = 4; // const/4 v3, 0x4
v4 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* sub-int/2addr v3, v4 */
/* if-ge v2, v3, :cond_3 */
/* const/16 v3, 0x30 */
(( java.lang.StringBuffer ) p1 ).append ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* add-int/lit8 v2, v2, 0x1 */
/* :sswitch_0 */
final String v1 = "\\\""; // const-string v1, "\\\""
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :goto_2
/* add-int/lit8 v0, v0, 0x1 */
/* :sswitch_1 */
final String v1 = "\\\\"; // const-string v1, "\\\\"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_2 */
final String v1 = "\\b"; // const-string v1, "\\b"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_3 */
final String v1 = "\\f"; // const-string v1, "\\f"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_4 */
final String v1 = "\\n"; // const-string v1, "\\n"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_5 */
final String v1 = "\\r"; // const-string v1, "\\r"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_6 */
final String v1 = "\\t"; // const-string v1, "\\t"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :sswitch_7 */
final String v1 = "\\/"; // const-string v1, "\\/"
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_3
(( java.lang.String ) v1 ).toUpperCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_4
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_5
return;
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x8 -> :sswitch_2 */
/* 0x9 -> :sswitch_6 */
/* 0xa -> :sswitch_4 */
/* 0xc -> :sswitch_3 */
/* 0xd -> :sswitch_5 */
/* 0x22 -> :sswitch_0 */
/* 0x2f -> :sswitch_7 */
/* 0x5c -> :sswitch_1 */
} // .end sparse-switch
} // .end method
