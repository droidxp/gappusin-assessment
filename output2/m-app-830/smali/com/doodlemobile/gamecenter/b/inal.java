public class inal {
	 /* # static fields */
	 private static android.content.Context a;
	 private static Long b;
	 private static Long c;
	 private static Long d;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 3 */
		 /* const-wide/16 v1, 0x0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* sput-wide v1, Lcom/doodlemobile/gamecenter/b/c;->b:J */
		 /* sput-wide v1, Lcom/doodlemobile/gamecenter/b/c;->c:J */
		 /* sput-wide v1, Lcom/doodlemobile/gamecenter/b/c;->d:J */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 4 */
		 /* const-wide/16 v2, 0x0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 com.doodlemobile.gamecenter.b.b .c ( );
		 /* move-result-wide v0 */
		 /* sput-wide v0, Lcom/doodlemobile/gamecenter/b/c;->b:J */
		 /* cmp-long v0, v0, v2 */
		 /* if-gez v0, :cond_0 */
		 /* sput-wide v2, Lcom/doodlemobile/gamecenter/b/c;->b:J */
	 } // :cond_0
	 com.doodlemobile.gamecenter.b.b .e ( );
	 /* move-result-wide v0 */
	 /* sput-wide v0, Lcom/doodlemobile/gamecenter/b/c;->c:J */
	 /* cmp-long v0, v0, v2 */
	 /* if-gez v0, :cond_1 */
	 /* sput-wide v2, Lcom/doodlemobile/gamecenter/b/c;->c:J */
} // :cond_1
com.doodlemobile.gamecenter.b.b .d ( );
/* move-result-wide v0 */
/* sput-wide v0, Lcom/doodlemobile/gamecenter/b/c;->d:J */
/* cmp-long v0, v0, v2 */
/* if-gez v0, :cond_2 */
/* sput-wide v2, Lcom/doodlemobile/gamecenter/b/c;->d:J */
} // :cond_2
return;
} // .end method
public static void a ( Long p0 ) {
/* .locals 0 */
/* sput-wide p0, Lcom/doodlemobile/gamecenter/b/c;->c:J */
return;
} // .end method
public static a ( java.lang.String p0 ) {
/* .locals 10 */
/* const-wide/16 v8, -0x1 */
int v7 = 0; // const/4 v7, 0x0
final String v0 = "headicon"; // const-string v0, "headicon"
/* if-nez p0, :cond_0 */
/* move-object v0, v7 */
} // :goto_0
} // :cond_0
com.doodlemobile.gamecenter.b.b .d ( );
/* move-result-wide v0 */
com.doodlemobile.gamecenter.e.c .a ( p0 );
/* sget-wide v3, Lcom/doodlemobile/gamecenter/b/c;->d:J */
/* const-wide/16 v5, 0x0 */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_1 */
/* move-object v0, v7 */
} // :cond_1
/* sget-wide v3, Lcom/doodlemobile/gamecenter/b/c;->d:J */
/* cmp-long v0, v0, v3 */
/* if-gez v0, :cond_3 */
final String v0 = "get head icon image from internet"; // const-string v0, "get head icon image from internet"
com.doodlemobile.gamecenter.e.b .a ( v0 );
com.doodlemobile.gamecenter.f.a .a ( v2 );
if ( v0 != null) { // if-eqz v0, :cond_2
try { // :try_start_0
v1 = com.doodlemobile.gamecenter.b.c.a;
final String v2 = "headicon"; // const-string v2, "headicon"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) v1 ).openFileOutput ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
(( java.io.OutputStream ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
(( java.io.OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
/* sget-wide v1, Lcom/doodlemobile/gamecenter/b/c;->d:J */
com.doodlemobile.gamecenter.b.b .a ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catch_0 */
/* move-exception v1 */
/* const-wide/16 v2, -0x1 */
try { // :try_start_1
com.doodlemobile.gamecenter.b.b .a ( v2,v3 );
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v1 */
} // :cond_2
/* move-object v0, v7 */
} // :cond_3
final String v0 = "get feature image from filesystem"; // const-string v0, "get feature image from filesystem"
com.doodlemobile.gamecenter.e.b .a ( v0 );
try { // :try_start_2
v0 = com.doodlemobile.gamecenter.b.c.a;
final String v1 = "headicon"; // const-string v1, "headicon"
(( android.content.Context ) v0 ).openFileInput ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
v1 = (( java.io.InputStream ) v0 ).available ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->available()I
/* new-array v1, v1, [B */
(( java.io.InputStream ) v0 ).read ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* move-object v0, v1 */
/* :catch_1 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
com.doodlemobile.gamecenter.b.b .a ( v8,v9 );
/* move-object v0, v7 */
} // .end method
public static void b ( Long p0 ) {
/* .locals 0 */
/* sput-wide p0, Lcom/doodlemobile/gamecenter/b/c;->b:J */
return;
} // .end method
public static void c ( Long p0 ) {
/* .locals 0 */
/* sput-wide p0, Lcom/doodlemobile/gamecenter/b/c;->d:J */
return;
} // .end method
