public class org.anddev.andengine.util.StringUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.StringUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer countOccurrences ( java.lang.String p0, Object p1 ) {
		 /* .locals 3 */
		 int v1 = 0; // const/4 v1, 0x0
		 v0 = 		 (( java.lang.String ) p0 ).indexOf ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Ljava/lang/String;->indexOf(II)I
	 } // :goto_0
	 int v2 = -1; // const/4 v2, -0x1
	 /* if-ne v0, v2, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* add-int/lit8 v0, v0, 0x1 */
v0 = (( java.lang.String ) p0 ).indexOf ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Ljava/lang/String;->indexOf(II)I
} // .end method
public static java.lang.String padFront ( java.lang.String p0, Object p1, Integer p2 ) {
/* .locals 3 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int v0, p2, v0 */
/* if-gtz v0, :cond_0 */
/* move-object v0, p0 */
} // :goto_0
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
} // :goto_1
/* if-gez v0, :cond_1 */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public static java.lang.String split ( java.lang.String p0, Object p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.util.StringUtils .split ( p0,p1,v0 );
} // .end method
public static java.lang.String split ( java.lang.String p0, Object p1, java.lang.String[] p2 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = org.anddev.andengine.util.StringUtils .countOccurrences ( p0,p1 );
/* add-int/lit8 v0, v0, 0x1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* array-length v1, p2 */
/* if-ne v1, v0, :cond_0 */
/* move v1, v5 */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* move-object v1, p2 */
} // :goto_1
/* if-nez v0, :cond_2 */
/* aput-object p0, v1, v2 */
} // :goto_2
} // :cond_0
/* move v1, v2 */
} // :cond_1
/* new-array v1, v0, [Ljava/lang/String; */
} // :cond_2
/* move v3, v2 */
} // :goto_3
/* sub-int v4, v0, v5 */
/* if-lt v2, v4, :cond_3 */
/* sub-int/2addr v0, v5 */
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
(( java.lang.String ) p0 ).substring ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* aput-object v2, v1, v0 */
} // :cond_3
v4 = (( java.lang.String ) p0 ).indexOf ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Ljava/lang/String;->indexOf(II)I
(( java.lang.String ) p0 ).substring ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* aput-object v3, v1, v2 */
/* add-int/lit8 v3, v4, 0x1 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
