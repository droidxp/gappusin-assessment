public class com.mxj.fun.Lsiens implements com.mxj.dinyd.Prosted {
	 /* .source "Lsiens.java" */
	 /* # interfaces */
	 /* # static fields */
	 static com.mxj.fun.Telspded telsp;
	 public static java.io.File usFile;
	 /* # direct methods */
	 public com.mxj.fun.Lsiens ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static getMesBytes ( com.mxj.stl.Ubas p0 ) {
		 /* .locals 4 */
		 /* .param p0, "suer" # Lcom/mxj/stl/Ubas; */
		 /* .prologue */
		 /* .line 27 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 28 */
		 /* .local v1, "bytes":[B */
		 /* new-instance v0, Ljava/io/ByteArrayOutputStream; */
		 /* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* .line 29 */
		 /* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
		 /* new-instance v2, Ljava/io/DataOutputStream; */
		 /* invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
		 /* .line 31 */
		 /* .local v2, "dos":Ljava/io/DataOutputStream; */
		 /* const/16 v3, 0x11 */
		 try { // :try_start_0
			 (( java.io.DataOutputStream ) v2 ).writeInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V
			 /* .line 32 */
			 /* const/16 v3, 0x20 */
			 (( java.io.DataOutputStream ) v2 ).writeInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V
			 /* .line 33 */
			 /* const/16 v3, 0x22 */
			 (( java.io.DataOutputStream ) v2 ).writeInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V
			 /* .line 35 */
			 (( com.mxj.stl.Ubas ) p0 ).setData ( v2 ); // invoke-virtual {p0, v2}, Lcom/mxj/stl/Ubas;->setData(Ljava/io/DataOutputStream;)Ljava/io/DataOutputStream;
			 /* .line 37 */
			 /* const/16 v3, 0x12 */
			 (( java.io.DataOutputStream ) v2 ).writeInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V
			 /* .line 39 */
			 (( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
			 /* .line 40 */
			 (( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
			 /* .line 41 */
			 (( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 46 */
		 } // :goto_0
		 /* .line 42 */
		 /* :catch_0 */
		 /* move-exception v3 */
	 } // .end method
	 public static java.lang.String getResult ( java.io.InputStream p0 ) {
		 /* .locals 9 */
		 /* .param p0, "inputStream" # Ljava/io/InputStream; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 91 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 92 */
	 /* .local v0, "bytes":[B */
	 com.mxj.tolas.Deaksde .inputStreamToBytes ( p0 );
	 /* .line 93 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* array-length v7, v0 */
		 /* if-nez v7, :cond_1 */
		 /* .line 122 */
	 } // :cond_0
	 /* .line 94 */
} // :cond_1
com.mxj.tolas.Deaksde .jbz ( v0 );
/* .line 95 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* array-length v7, v0 */
	 /* if-lez v7, :cond_0 */
	 /* .line 99 */
	 /* new-instance v1, Ljava/io/DataInputStream; */
	 /* new-instance v7, Ljava/io/ByteArrayInputStream; */
	 /* .line 100 */
	 /* invoke-direct {v7, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
	 /* .line 99 */
	 /* invoke-direct {v1, v7}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
	 /* .line 101 */
	 /* .local v1, "dis":Ljava/io/DataInputStream; */
	 v5 = 	 (( java.io.DataInputStream ) v1 ).readInt ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I
	 /* .line 102 */
	 /* .local v5, "tag":I */
	 /* const/16 v7, 0x11 */
	 /* if-ne v5, v7, :cond_0 */
	 /* .line 105 */
	 final String v2 = ""; // const-string v2, ""
	 /* .line 107 */
	 /* .local v2, "result":Ljava/lang/String; */
} // :goto_0
v5 = (( java.io.DataInputStream ) v1 ).readInt ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I
/* .line 108 */
/* const/16 v7, 0x12 */
/* if-eq v5, v7, :cond_0 */
/* .line 110 */
/* packed-switch v5, :pswitch_data_0 */
/* .line 112 */
/* :pswitch_0 */
v6 = (( java.io.DataInputStream ) v1 ).readInt ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I
/* .line 113 */
/* .local v6, "usif":I */
(( java.io.DataInputStream ) v1 ).readLong ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v3 */
/* .line 114 */
/* .local v3, "retsm":J */
/* new-instance v7, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v8 = ","; // const-string v8, ","
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 115 */
/* new-instance v7, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v3, v4 ); // invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 116 */
/* .line 110 */
/* :pswitch_data_0 */
/* .packed-switch 0x32 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static void init ( android.app.Activity p0 ) {
/* .locals 3 */
/* .param p0, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 126 */
/* new-instance v0, Ljava/io/File; */
(( android.app.Activity ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getFilesDir()Ljava/io/File;
final String v2 = "mes.txt"; // const-string v2, "mes.txt"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 127 */
v0 = com.mxj.fun.Lsiens.usFile;
com.mxj.tolas.Tools .createFile ( v0 );
/* .line 128 */
/* new-instance v0, Lcom/mxj/fun/Telspded; */
/* invoke-direct {v0, p0}, Lcom/mxj/fun/Telspded;-><init>(Landroid/content/Context;)V */
/* .line 130 */
return;
} // .end method
public static void savses ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "mes" # Ljava/lang/String; */
/* .prologue */
/* .line 81 */
/* if-nez p0, :cond_0 */
/* .line 88 */
} // :goto_0
return;
/* .line 83 */
} // :cond_0
try { // :try_start_0
v0 = com.mxj.fun.Lsiens.usFile;
final String v1 = "utf-8"; // const-string v1, "utf-8"
com.mxj.tolas.Tools .saveFileContent ( v0,p0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 84 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public static java.io.InputStream senbuest ( Object[] p0 ) {
/* .locals 3 */
/* .param p0, "sendBytes" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 51 */
/* new-instance v1, Lcom/mxj/fun/Lelux; */
/* invoke-direct {v1}, Lcom/mxj/fun/Lelux;-><init>()V */
/* .line 52 */
/* .local v1, "urector":Lcom/mxj/fun/Lelux; */
(( com.mxj.fun.Lelux ) v1 ).getOutputStream ( ); // invoke-virtual {v1}, Lcom/mxj/fun/Lelux;->getOutputStream()Ljava/io/OutputStream;
/* .line 54 */
/* .local v0, "out":Ljava/io/OutputStream; */
int v2 = 1; // const/4 v2, 0x1
try { // :try_start_0
com.mxj.tolas.Deaksde .baoZask ( p0,v2 );
/* .line 55 */
(( java.io.OutputStream ) v0 ).write ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
/* .line 56 */
int p0 = 0; // const/4 p0, 0x0
/* .line 57 */
(( com.mxj.fun.Lelux ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Lcom/mxj/fun/Lelux;->getInputStream()Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 61 */
} // :goto_0
/* .line 58 */
/* :catch_0 */
/* move-exception v2 */
/* .line 61 */
int v2 = 0; // const/4 v2, 0x0
} // .end method
public static void sentMeas ( android.app.Activity p0 ) {
/* .locals 4 */
/* .param p0, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 66 */
try { // :try_start_0
com.mxj.fun.Lsiens .init ( p0 );
/* .line 67 */
v2 = com.mxj.fun.Lsiens.telsp;
(( com.mxj.fun.Telspded ) v2 ).getUser ( ); // invoke-virtual {v2}, Lcom/mxj/fun/Telspded;->getUser()Lcom/mxj/stl/Ubas;
com.mxj.fun.Lsiens .getMesBytes ( v2 );
com.mxj.fun.Lsiens .senbuest ( v2 );
/* .line 69 */
/* .local v0, "in":Ljava/io/InputStream; */
v2 = com.mxj.fun.Lsiens.telsp;
(( com.mxj.fun.Telspded ) v2 ).getUser ( ); // invoke-virtual {v2}, Lcom/mxj/fun/Telspded;->getUser()Lcom/mxj/stl/Ubas;
v2 = (( com.mxj.stl.Ubas ) v2 ).getsdfd ( ); // invoke-virtual {v2}, Lcom/mxj/stl/Ubas;->getsdfd()I
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_0 */
/* .line 70 */
com.mxj.fun.Lsiens .getResult ( v0 );
/* .line 71 */
/* .local v1, "meString":Ljava/lang/String; */
com.mxj.fun.Lsiens .savses ( v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 77 */
} // .end local v0 # "in":Ljava/io/InputStream;
} // .end local v1 # "meString":Ljava/lang/String;
} // :cond_0
} // :goto_0
return;
/* .line 73 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
