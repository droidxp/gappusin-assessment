public class com.acv.bc.a.Mm extends java.lang.Thread {
	 /* # static fields */
	 public static final java.lang.String a;
	 public static final java.lang.String b;
	 public static java.lang.String c;
	 private static final f;
	 /* # instance fields */
	 com.acv.a.Mk d;
	 com.acv.a.Gb e;
	 private android.content.Context g;
	 private Boolean h;
	 private com.acv.bc.bc.Mm i;
	 private com.acv.bc.a.Mk j;
	 private android.net.ConnectivityManager k;
	 /* # direct methods */
	 static com.acv.bc.a.Mm ( ) {
		 /* .locals 2 */
		 /* const-class v0, Lcom/acv/bc/a/Mm; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 /* const/16 v0, 0x18 */
		 /* new-array v0, v0, [B */
		 /* fill-array-data v0, :array_0 */
		 /* new-instance v0, Ljava/lang/String; */
		 int v1 = 6; // const/4 v1, 0x6
		 /* new-array v1, v1, [C */
		 /* fill-array-data v1, :array_1 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 v0 = com.acv.bc.bc.Gb.b;
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 1 */
		 /* -0x65t */
		 /* -0x21t */
		 /* -0xft */
		 /* 0x4ct */
		 /* 0x49t */
		 /* 0x57t */
		 /* -0x1at */
		 /* 0xdt */
		 /* 0x76t */
		 /* -0x38t */
		 /* 0x37t */
		 /* -0x21t */
		 /* -0x77t */
		 /* -0x6et */
		 /* 0xbt */
		 /* -0x4bt */
		 /* -0x1at */
		 /* -0xft */
		 /* -0x4at */
		 /* -0x47t */
		 /* -0x2t */
		 /* -0x1at */
		 /* -0x55t */
		 /* -0x5ct */
	 } // .end array-data
	 /* :array_1 */
	 /* .array-data 2 */
	 /* 0x79s */
	 /* 0x75s */
	 /* 0x6es */
	 /* 0x51s */
	 /* 0x75s */
	 /* 0x65s */
} // .end array-data
} // .end method
public com.acv.bc.a.Mm ( ) {
/* .locals 3 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
this.d = v0;
/* new-instance v0, Lcom/acv/a/Gb; */
/* invoke-direct {v0}, Lcom/acv/a/Gb;-><init>()V */
this.e = v0;
this.g = p1;
this.j = p2;
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/acv/bc/a/Mm;->h:Z */
/* new-instance v0, Lcom/acv/bc/bc/Mm; */
/* invoke-direct {v0, p1}, Lcom/acv/bc/bc/Mm;-><init>(Landroid/content/Context;)V */
this.i = v0;
/* new-instance v0, Lcom/acv/a/Mk; */
/* new-instance v1, Ljava/lang/String; */
/* const/16 v2, 0xf */
/* new-array v2, v2, [C */
/* fill-array-data v2, :array_0 */
/* invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V */
/* invoke-direct {v0, p1, v1}, Lcom/acv/a/Mk;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
this.d = v0;
final String v0 = "connectivity"; // const-string v0, "connectivity"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/ConnectivityManager; */
this.k = v0;
/* invoke-direct {p0, p1}, Lcom/acv/bc/a/Mm;->b(Landroid/content/Context;)V */
return;
/* :array_0 */
/* .array-data 2 */
/* 0x6cs */
/* 0x61s */
/* 0x72s */
/* 0x6bs */
/* 0x43s */
/* 0x6fs */
/* 0x6es */
/* 0x74s */
/* 0x72s */
/* 0x6fs */
/* 0x6cs */
/* 0x2es */
/* 0x69s */
/* 0x6es */
/* 0x69s */
} // .end array-data
} // .end method
public static void a ( android.content.Context p0 ) {
/* .locals 1 */
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getFilesDir ( ); // invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
com.a.Gb .a ( );
return;
} // .end method
private void a ( java.lang.String p0 ) {
/* .locals 7 */
int v2 = 0; // const/4 v2, 0x0
try { // :try_start_0
/* invoke-direct {p0}, Lcom/acv/bc/a/Mm;->c()[B */
/* invoke-direct {p0, p1, v0}, Lcom/acv/bc/a/Mm;->a(Ljava/lang/String;[B)[B */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* array-length v1, v0 */
	 /* if-gtz v1, :cond_3 */
} // :cond_0
v0 = com.acv.bc.a.Mm.a;
/* new-instance v1, Ljava/lang/String; */
/* const/16 v3, 0xf */
/* new-array v3, v3, [C */
/* fill-array-data v3, :array_0 */
/* invoke-direct {v1, v3}, Ljava/lang/String;-><init>([C)V */
com.acv.bc.bc.Mk .b ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v2 != null) { // if-eqz v2, :cond_1
	 (( java.io.DataInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
	 (( java.io.ByteArrayInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V
} // :cond_2
} // :goto_0
return;
} // :cond_3
try { // :try_start_1
/* new-instance v3, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
try { // :try_start_2
/* new-instance v1, Ljava/io/DataInputStream; */
/* invoke-direct {v1, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
try { // :try_start_3
	 v0 = 	 (( java.io.DataInputStream ) v1 ).readInt ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I
	 v2 = com.acv.bc.a.Mm.a;
	 java.lang.Integer .toHexString ( v0 );
	 com.acv.bc.bc.Mk .a ( v2,v4 );
	 int v2 = 5; // const/4 v2, 0x5
	 /* if-ne v2, v0, :cond_4 */
	 v0 = this.j;
	 v2 = 	 (( java.io.DataInputStream ) v1 ).readInt ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I
	 (( com.acv.bc.a.Mk ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/acv/bc/a/Mk;->a(I)V
	 v0 = this.j;
	 (( java.io.DataInputStream ) v1 ).readLong ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readLong()J
	 /* move-result-wide v4 */
	 (( com.acv.bc.a.Mk ) v0 ).a ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Lcom/acv/bc/a/Mk;->a(J)V
	 v0 = this.j;
	 (( java.io.DataInputStream ) v1 ).readLong ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readLong()J
	 /* move-result-wide v4 */
	 (( com.acv.bc.a.Mk ) v0 ).b ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Lcom/acv/bc/a/Mk;->b(J)V
	 v0 = this.j;
	 (( java.io.DataInputStream ) v1 ).readUTF ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
	 (( com.acv.bc.a.Mk ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/acv/bc/a/Mk;->a(Ljava/lang/String;)V
	 v0 = this.j;
	 v2 = 	 (( java.io.DataInputStream ) v1 ).readBoolean ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readBoolean()Z
	 (( com.acv.bc.a.Mk ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/acv/bc/a/Mk;->a(Z)V
	 (( java.io.DataInputStream ) v1 ).readLong ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readLong()J
	 /* move-result-wide v4 */
	 (( java.io.DataInputStream ) v1 ).readUTF ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
	 /* invoke-direct {p0, v0}, Lcom/acv/bc/a/Mm;->b(Ljava/lang/String;)V */
	 /* new-instance v0, Ljava/lang/String; */
	 /* const/16 v2, 0x8 */
	 /* new-array v2, v2, [C */
	 /* fill-array-data v2, :array_1 */
	 /* invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( v4,v5 );
	 /* invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.acv.bc.bc.Mk .b ( v0,v2 );
	 v0 = this.j;
	 (( com.acv.bc.a.Mk ) v0 ).c ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Lcom/acv/bc/a/Mk;->c(J)V
	 v0 = com.acv.bc.a.Mm.a;
	 v2 = this.j;
	 com.acv.bc.bc.Gg .a ( v2 );
	 com.acv.bc.bc.Mk .b ( v0,v2 );
	 v0 = this.j;
	 v2 = this.g;
	 v4 = com.acv.bc.a.Mk.b;
	 int v5 = 0; // const/4 v5, 0x0
	 (( android.content.Context ) v2 ).getSharedPreferences ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 (( com.acv.bc.a.Mk ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lcom/acv/bc/a/Mk;->b(Landroid/content/SharedPreferences;)V
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_5
	 (( java.io.DataInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
} // :cond_5
if ( v3 != null) { // if-eqz v3, :cond_2
	 (( java.io.ByteArrayInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayInputStream;->close()V
	 /* goto/16 :goto_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* move-object v1, v2 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_6
	 (( java.io.DataInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
} // :cond_6
if ( v2 != null) { // if-eqz v2, :cond_7
	 (( java.io.ByteArrayInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V
} // :cond_7
/* throw v0 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v2 */
/* move-object v2, v3 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v2, v3 */
/* :array_0 */
/* .array-data 2 */
/* 0x72s */
/* 0x65s */
/* 0x73s */
/* 0x69s */
/* 0x76s */
/* 0x65s */
/* 0x20s */
/* 0x69s */
/* 0x73s */
/* 0x20s */
/* 0x6es */
/* 0x75s */
/* 0x6cs */
/* 0x6cs */
/* 0x21s */
} // .end array-data
/* nop */
/* :array_1 */
/* .array-data 2 */
/* 0x6cs */
/* 0x61s */
/* 0x73s */
/* 0x74s */
/* 0x54s */
/* 0x69s */
/* 0x6ds */
/* 0x65s */
} // .end array-data
} // .end method
private a ( java.lang.String p0, Object[] p1 ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
/* move-object v0, v1 */
/* check-cast v0, [B */
/* check-cast v1, [B */
/* new-instance v1, Lcom/acv/bc/bc/Gb; */
/* invoke-direct {v1}, Lcom/acv/bc/bc/Gb;-><init>()V */
try { // :try_start_0
v0 = com.acv.bc.a.Mm.f;
com.acv.bc.bc.Gg .a ( p2,v0 );
int v2 = 1; // const/4 v2, 0x1
(( com.acv.bc.bc.Gb ) v1 ).a ( p1, v0, v2 ); // invoke-virtual {v1, p1, v0, v2}, Lcom/acv/bc/bc/Gb;->a(Ljava/lang/String;[BZ)[B
v2 = com.acv.bc.a.Mm.f;
com.acv.bc.bc.Gg .b ( v0,v2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
(( com.acv.bc.bc.Gb ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/acv/bc/bc/Gb;->a()V
/* :catchall_0 */
/* move-exception v0 */
(( com.acv.bc.bc.Gb ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/acv/bc/bc/Gb;->a()V
/* throw v0 */
} // .end method
private void b ( android.content.Context p0 ) {
/* .locals 4 */
v0 = this.e;
/* const v1, 0xaa0321 */
v2 = com.acv.bc.a.Mm.b;
v3 = com.acv.bc.a.Mm.c;
(( com.acv.a.Gb ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/acv/a/Gb;->a(ILjava/lang/String;Ljava/lang/String;)V
v0 = this.e;
int v1 = 1; // const/4 v1, 0x1
(( com.acv.a.Gb ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/acv/a/Gb;->a(Z)V
return;
} // .end method
private void b ( java.lang.String p0 ) {
/* .locals 4 */
int v1 = 1; // const/4 v1, 0x1
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = "0"; // const-string v0, "0"
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
java.lang.Boolean .valueOf ( v0 );
} // :cond_1
} // :goto_0
return;
} // :cond_2
final String v0 = "1"; // const-string v0, "1"
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
java.lang.Boolean .valueOf ( v1 );
try { // :try_start_0
final String v0 = ":"; // const-string v0, ":"
(( java.lang.String ) p1 ).split ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
java.lang.Long .parseLong ( v0 );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x64 */
/* cmp-long v2, v0, v2 */
/* if-ltz v2, :cond_1 */
/* sput-wide v0, Lcom/a/Gb;->h:J */
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.NumberFormatException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V
} // .end method
private c ( ) {
/* .locals 3 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v1, Ljava/io/DataOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* const/16 v2, 0xf00 */
(( java.io.DataOutputStream ) v1 ).writeInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V
/* const v2, 0xa001 */
(( java.io.DataOutputStream ) v1 ).writeInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V
int v2 = 1; // const/4 v2, 0x1
(( java.io.DataOutputStream ) v1 ).writeInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V
v2 = this.i;
(( com.acv.bc.bc.Mm ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/acv/bc/bc/Mm;->a(Ljava/io/DataOutputStream;)V
int v2 = 3; // const/4 v2, 0x3
(( java.io.DataOutputStream ) v1 ).writeInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V
v2 = this.j;
(( com.acv.bc.a.Mk ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/acv/bc/a/Mk;->a(Ljava/io/DataOutputStream;)V
/* const/16 v2, 0xfcc */
(( java.io.DataOutputStream ) v1 ).writeInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
(( java.io.DataOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V
(( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
} // .end method
/* # virtual methods */
public Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/acv/bc/a/Mm;->h:Z */
} // .end method
public Boolean b ( ) {
/* .locals 1 */
v0 = this.k;
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void run ( ) {
/* .locals 8 */
int v5 = 0; // const/4 v5, 0x0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* invoke-super {p0}, Ljava/lang/Thread;->run()V */
try { // :try_start_0
v0 = (( com.acv.bc.a.Mm ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/acv/bc/a/Mm;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 v0 = this.d;
	 v3 = this.e;
	 (( com.acv.a.Mk ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/acv/a/Mk;->a(Lcom/acv/a/Gb;)Z
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 v0 = 	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* if-nez v0, :cond_1 */
	 /* iget-boolean v0, p0, Lcom/acv/bc/a/Mm;->h:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iput-boolean v5, p0, Lcom/acv/bc/a/Mm;->h:Z */
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
try { // :try_start_1
v0 = this.d;
(( com.acv.a.Mk ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/acv/a/Mk;->a()Lcom/acv/a/Gb;
v3 = this.d;
(( com.acv.a.Mk ) v3 ).a ( ); // invoke-virtual {v3}, Lcom/acv/a/Mk;->a()Lcom/acv/a/Gb;
(( com.acv.a.Gb ) v3 ).d ( ); // invoke-virtual {v3}, Lcom/acv/a/Gb;->d()Ljava/lang/String;
/* invoke-direct {p0, v3}, Lcom/acv/bc/a/Mm;->a(Ljava/lang/String;)V */
int v3 = 1; // const/4 v3, 0x1
(( com.acv.a.Gb ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/acv/a/Gb;->a(Z)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
(( com.acv.a.Gb ) v0 ).b ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Lcom/acv/a/Gb;->b(J)V
v3 = this.d;
(( com.acv.a.Mk ) v3 ).b ( v0 ); // invoke-virtual {v3, v0}, Lcom/acv/a/Mk;->b(Lcom/acv/a/Gb;)Z
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_2
/* iget-boolean v0, p0, Lcom/acv/bc/a/Mm;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iput-boolean v5, p0, Lcom/acv/bc/a/Mm;->h:Z */
} // :cond_3
} // :goto_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
v0 = com.acv.bc.a.Mm.a;
/* new-instance v5, Ljava/lang/StringBuilder; */
/* new-instance v6, Ljava/lang/String; */
/* const/16 v7, 0xa */
/* new-array v7, v7, [C */
/* fill-array-data v7, :array_0 */
/* invoke-direct {v6, v7}, Ljava/lang/String;-><init>([C)V */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* sub-long v1, v3, v1 */
(( java.lang.StringBuilder ) v5 ).append ( v1, v2 ); // invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.acv.bc.bc.Mk .b ( v0,v1 );
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_2
v3 = com.acv.bc.a.Mm.a;
final String v4 = "Exception!"; // const-string v4, "Exception!"
com.acv.bc.bc.Mk .a ( v3,v4,v0 );
v0 = this.d;
(( com.acv.a.Mk ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/acv/a/Mk;->a()Lcom/acv/a/Gb;
int v3 = 0; // const/4 v3, 0x0
(( com.acv.a.Gb ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/acv/a/Gb;->a(Z)V
v3 = this.d;
(( com.acv.a.Mk ) v3 ).b ( v0 ); // invoke-virtual {v3, v0}, Lcom/acv/a/Mk;->b(Lcom/acv/a/Gb;)Z
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* iget-boolean v0, p0, Lcom/acv/bc/a/Mm;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iput-boolean v5, p0, Lcom/acv/bc/a/Mm;->h:Z */
/* :catchall_0 */
/* move-exception v0 */
/* iget-boolean v1, p0, Lcom/acv/bc/a/Mm;->h:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
	 /* iput-boolean v5, p0, Lcom/acv/bc/a/Mm;->h:Z */
} // :cond_4
/* throw v0 */
/* nop */
/* :array_0 */
/* .array-data 2 */
/* 0x75s */
/* 0x73s */
/* 0x65s */
/* 0x64s */
/* 0x20s */
/* 0x74s */
/* 0x69s */
/* 0x6ds */
/* 0x65s */
/* 0x3as */
} // .end array-data
} // .end method
public synchronized void start ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Lcom/acv/bc/a/Mm;->h:Z */
/* invoke-super {p0}, Ljava/lang/Thread;->start()V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
