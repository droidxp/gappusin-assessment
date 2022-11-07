public class com.umeng.common.util.i {
	 /* .source "NetUtil.java" */
	 /* # direct methods */
	 public com.umeng.common.util.i ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( java.util.Map p0, java.lang.String p1 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Map", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Object;", */
		 /* ">;", */
		 /* "Ljava/lang/String;", */
		 /* ")", */
		 /* "Ljava/lang/String;" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 19 */
		 v0 = 	 if ( p0 != null) { // if-eqz p0, :cond_0
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 33 */
		 } // :cond_0
	 } // :goto_0
	 /* .line 22 */
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 23 */
/* .line 24 */
final String v2 = "?"; // const-string v2, "?"
v2 = (( java.lang.String ) p1 ).endsWith ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v2, :cond_2 */
/* .line 25 */
final String v2 = "?"; // const-string v2, "?"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 26 */
} // :cond_2
v0 = } // :goto_1
/* if-nez v0, :cond_3 */
/* .line 32 */
v0 = (( java.lang.StringBuilder ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v0, v0, -0x1 */
(( java.lang.StringBuilder ) v1 ).deleteCharAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
/* .line 33 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 26 */
} // :cond_3
/* check-cast v0, Ljava/lang/String; */
/* .line 27 */
/* new-instance v3, Ljava/lang/StringBuilder; */
java.net.URLEncoder .encode ( v0 );
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 28 */
final String v4 = "="; // const-string v4, "="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 29 */
/* if-nez v4, :cond_4 */
final String v0 = ""; // const-string v0, ""
} // :goto_2
java.net.URLEncoder .encode ( v0 );
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 30 */
final String v3 = "&"; // const-string v3, "&"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 27 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 30 */
} // :cond_4
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
