public class net.chobin.android.psdxylz.app.ar {
	 /* # static fields */
	 private static Long a;
	 private static java.util.Random a;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.ar ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-gtz p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
v0 = net.chobin.android.psdxylz.app.ar.a;
v0 = (( java.util.Random ) v0 ).nextInt ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextInt()I
v0 = java.lang.Math .abs ( v0 );
/* rem-int/2addr v0, p0 */
} // .end method
public static java.lang.String a ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, p0 */
/* move v2, v0 */
} // :goto_0
/* if-gtz v1, :cond_1 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
/* move v1, v0 */
} // :goto_1
/* sub-int v0, p1, v2 */
/* if-lt v1, v0, :cond_2 */
/* if-lez p0, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* div-int/lit8 v1, v1, 0xa */
} // :cond_2
if ( p2 != null) { // if-eqz p2, :cond_3
final String v0 = "0"; // const-string v0, "0"
} // :goto_2
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_3
final String v0 = " "; // const-string v0, " "
} // .end method
public static java.lang.String a ( java.lang.String p0, Integer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* check-cast v0, [B */
} // :goto_0
try { // :try_start_0
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
(( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* array-length v0, v1 */
/* if-gt v0, p1, :cond_0 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
} // :goto_1
/* :catch_0 */
/* move-exception v0 */
final String v0 = ""; // const-string v0, ""
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, -0x1 */
(( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.lang.String p0, Integer p1, android.graphics.Paint p2 ) {
/* .locals 2 */
} // :goto_0
v0 = (( android.graphics.Paint ) p2 ).measureText ( p0 ); // invoke-virtual {p2, p0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* float-to-int v0, v0 */
/* if-gt v0, p1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, -0x1 */
(( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public static void a ( ) {
/* .locals 2 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lnet/chobin/android/psdxylz/app/ar;->a:J */
return;
} // .end method
public static void a ( Integer p0 ) {
/* .locals 2 */
/* int-to-long v0, p0 */
try { // :try_start_0
java.lang.Thread .sleep ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
public static Boolean a ( java.lang.String p0 ) {
/* .locals 4 */
int v1 = 0; // const/4 v1, 0x0
/* move v0, v1 */
} // :goto_0
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-lt v0, v2, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // :cond_1
v2 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x7e */
/* if-le v2, v3, :cond_2 */
/* const/16 v3, 0xa5 */
/* if-eq v2, v3, :cond_2 */
/* const/16 v3, 0x203e */
/* if-ne v2, v3, :cond_0 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static a ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* new-array v1, p0, [I */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v2, v1 */
/* if-lt v0, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* array-length v2, v1 */
/* if-lt v0, v2, :cond_1 */
} // :cond_0
/* add-int v2, v0, p1 */
/* aput v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* add-int/lit8 v2, v0, 0x1 */
v2 = net.chobin.android.psdxylz.app.ar .a ( v2 );
/* aget v3, v1, v0 */
/* aget v4, v1, v2 */
/* aput v4, v1, v0 */
/* aput v3, v1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
