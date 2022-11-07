public class com.cont.fun.Cont implements com.cont.declare.Prot {
	 /* .source "Cont.java" */
	 /* # interfaces */
	 /* # static fields */
	 static com.cont.fun.PhoMes telephony;
	 public static java.io.File userFile;
	 /* # direct methods */
	 public com.cont.fun.Cont ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean casGon ( android.content.Context p0 ) {
		 /* .locals 8 */
		 /* .param p0, "activity" # Landroid/content/Context; */
		 /* .prologue */
		 int v5 = 1; // const/4 v5, 0x1
		 int v6 = 0; // const/4 v6, 0x0
		 /* .line 133 */
		 try { // :try_start_0
			 v7 = com.cont.fun.Cont.telephony;
			 /* if-nez v7, :cond_0 */
			 /* .line 134 */
			 com.cont.fun.Cont .init ( p0 );
			 /* .line 137 */
		 } // :cond_0
		 v7 = com.cont.fun.Cont.telephony;
		 (( com.cont.fun.PhoMes ) v7 ).getUser ( ); // invoke-virtual {v7}, Lcom/cont/fun/PhoMes;->getUser()Lcom/cont/bean/US;
		 com.cont.fun.Cont .getUserMesBytes ( v7 );
		 com.cont.fun.Cont .sendRequest ( v7 );
		 /* .line 139 */
		 /* .local v1, "in":Ljava/io/InputStream; */
		 com.cont.fun.Cont .getResult ( v1 );
		 /* .line 140 */
		 /* .local v2, "meString":Ljava/lang/String; */
		 final String v7 = ";"; // const-string v7, ";"
		 (( java.lang.String ) v2 ).split ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
		 /* .line 142 */
		 /* .local v3, "ssStrings":[Ljava/lang/String; */
		 int v7 = 0; // const/4 v7, 0x0
		 /* aget-object v4, v3, v7 */
		 /* .line 143 */
		 /* .local v4, "userMesString":Ljava/lang/String; */
		 com.cont.fun.Cont .saveMes ( v4 );
		 /* .line 145 */
		 int v7 = 1; // const/4 v7, 0x1
		 /* aget-object v0, v3, v7 */
		 /* .line 146 */
		 /* .local v0, "controlMesString":Ljava/lang/String; */
		 final String v7 = "true"; // const-string v7, "true"
		 (( java.lang.String ) v0 ).equals ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* :try_end_0 */
		 v7 = 		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 if ( v7 != null) { // if-eqz v7, :cond_1
			 /* .line 155 */
		 } // .end local v0 # "controlMesString":Ljava/lang/String;
	 } // .end local v1 # "in":Ljava/io/InputStream;
} // .end local v2 # "meString":Ljava/lang/String;
} // .end local v3 # "ssStrings":[Ljava/lang/String;
} // .end local v4 # "userMesString":Ljava/lang/String;
} // :goto_0
/* .restart local v0 # "controlMesString":Ljava/lang/String; */
/* .restart local v1 # "in":Ljava/io/InputStream; */
/* .restart local v2 # "meString":Ljava/lang/String; */
/* .restart local v3 # "ssStrings":[Ljava/lang/String; */
/* .restart local v4 # "userMesString":Ljava/lang/String; */
} // :cond_1
/* move v5, v6 */
/* .line 149 */
/* .line 151 */
} // .end local v0 # "controlMesString":Ljava/lang/String;
} // .end local v1 # "in":Ljava/io/InputStream;
} // .end local v2 # "meString":Ljava/lang/String;
} // .end local v3 # "ssStrings":[Ljava/lang/String;
} // .end local v4 # "userMesString":Ljava/lang/String;
/* :catch_0 */
/* move-exception v5 */
/* move v5, v6 */
/* .line 155 */
} // .end method
public static java.lang.String getResult ( java.io.InputStream p0 ) {
/* .locals 10 */
/* .param p0, "inputStream" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 83 */
/* if-nez p0, :cond_1 */
/* .line 120 */
} // :cond_0
/* .line 85 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 86 */
/* .local v0, "bytes":[B */
com.cont.tools.DeCode .inputStreamToBytes ( p0 );
/* .line 87 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* array-length v8, v0 */
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 89 */
com.cont.tools.DeCode .jbz ( v0 );
/* .line 90 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* array-length v8, v0 */
/* if-lez v8, :cond_0 */
/* .line 94 */
/* new-instance v2, Ljava/io/DataInputStream; */
/* new-instance v8, Ljava/io/ByteArrayInputStream; */
/* .line 95 */
/* invoke-direct {v8, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* .line 94 */
/* invoke-direct {v2, v8}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 96 */
/* .local v2, "dis":Ljava/io/DataInputStream; */
v6 = (( java.io.DataInputStream ) v2 ).readInt ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I
/* .line 97 */
/* .local v6, "tag":I */
/* const/16 v8, 0x11 */
/* if-ne v6, v8, :cond_0 */
/* .line 100 */
final String v5 = ""; // const-string v5, ""
/* .line 102 */
/* .local v5, "result":Ljava/lang/String; */
} // :goto_0
v6 = (( java.io.DataInputStream ) v2 ).readInt ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I
/* .line 103 */
/* const/16 v8, 0x12 */
/* if-eq v6, v8, :cond_0 */
/* .line 106 */
/* packed-switch v6, :pswitch_data_0 */
/* .line 108 */
/* :pswitch_0 */
v7 = (( java.io.DataInputStream ) v2 ).readInt ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I
/* .line 109 */
/* .local v7, "uid":I */
(( java.io.DataInputStream ) v2 ).readLong ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v3 */
/* .line 110 */
/* .local v3, "regTime":J */
v8 = (( java.io.DataInputStream ) v2 ).readBoolean ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readBoolean()Z
java.lang.Boolean .valueOf ( v8 );
/* .line 111 */
/* .local v1, "cango":Ljava/lang/Boolean; */
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v5 );
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v9 = ","; // const-string v9, ","
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 112 */
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v5 );
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v3, v4 ); // invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v9 = ";"; // const-string v9, ";"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 113 */
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v5 );
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 114 */
/* .line 106 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x32 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static getUserMesBytes ( com.cont.bean.US p0 ) {
/* .locals 5 */
/* .param p0, "user" # Lcom/cont/bean/US; */
/* .prologue */
/* .line 32 */
int v1 = 0; // const/4 v1, 0x0
/* .line 33 */
/* .local v1, "bytes":[B */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 34 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 36 */
/* .local v2, "dos":Ljava/io/DataOutputStream; */
/* const/16 v4, 0x11 */
try { // :try_start_0
(( java.io.DataOutputStream ) v2 ).writeInt ( v4 ); // invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeInt(I)V
/* .line 37 */
/* const/16 v4, 0x20 */
(( java.io.DataOutputStream ) v2 ).writeInt ( v4 ); // invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeInt(I)V
/* .line 38 */
/* const/16 v4, 0x22 */
(( java.io.DataOutputStream ) v2 ).writeInt ( v4 ); // invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeInt(I)V
/* .line 40 */
(( com.cont.bean.US ) p0 ).setData ( v2 ); // invoke-virtual {p0, v2}, Lcom/cont/bean/US;->setData(Ljava/io/DataOutputStream;)Ljava/io/DataOutputStream;
/* .line 42 */
/* const/16 v4, 0x12 */
(( java.io.DataOutputStream ) v2 ).writeInt ( v4 ); // invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeInt(I)V
/* .line 44 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 45 */
(( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 46 */
(( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 51 */
} // :goto_0
/* .line 47 */
/* :catch_0 */
/* move-exception v3 */
/* .line 48 */
/* .local v3, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static void init ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "activity" # Landroid/content/Context; */
/* .prologue */
/* .line 125 */
/* new-instance v0, Ljava/io/File; */
(( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
final String v2 = "ContMes.txt"; // const-string v2, "ContMes.txt"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 126 */
v0 = com.cont.fun.Cont.userFile;
com.cont.tools.Tools .createFile ( v0 );
/* .line 127 */
/* new-instance v0, Lcom/cont/fun/PhoMes; */
/* invoke-direct {v0, p0}, Lcom/cont/fun/PhoMes;-><init>(Landroid/content/Context;)V */
/* .line 129 */
return;
} // .end method
public static void saveMes ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "mes" # Ljava/lang/String; */
/* .prologue */
/* .line 72 */
/* if-nez p0, :cond_0 */
/* .line 80 */
} // :goto_0
return;
/* .line 75 */
} // :cond_0
try { // :try_start_0
v0 = com.cont.fun.Cont.userFile;
final String v1 = "utf-8"; // const-string v1, "utf-8"
com.cont.tools.Tools .saveFileContent ( v0,p0,v1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 76 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public static java.io.InputStream sendRequest ( Object[] p0 ) {
/* .locals 4 */
/* .param p0, "sendBytes" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 56 */
/* new-instance v2, Lcom/cont/fun/UCon; */
/* invoke-direct {v2}, Lcom/cont/fun/UCon;-><init>()V */
/* .line 57 */
/* .local v2, "urlConnector":Lcom/cont/fun/UCon; */
(( com.cont.fun.UCon ) v2 ).getOutputStream ( ); // invoke-virtual {v2}, Lcom/cont/fun/UCon;->getOutputStream()Ljava/io/OutputStream;
/* .line 59 */
/* .local v1, "out":Ljava/io/OutputStream; */
int v3 = 1; // const/4 v3, 0x1
try { // :try_start_0
com.cont.tools.DeCode .decode ( p0,v3 );
/* .line 60 */
(( java.io.OutputStream ) v1 ).write ( p0 ); // invoke-virtual {v1, p0}, Ljava/io/OutputStream;->write([B)V
/* .line 61 */
int p0 = 0; // const/4 p0, 0x0
/* .line 62 */
(( com.cont.fun.UCon ) v2 ).getInputStream ( ); // invoke-virtual {v2}, Lcom/cont/fun/UCon;->getInputStream()Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 66 */
} // :goto_0
/* .line 63 */
/* :catch_0 */
/* move-exception v0 */
/* .line 64 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 66 */
int v3 = 0; // const/4 v3, 0x0
} // .end method
