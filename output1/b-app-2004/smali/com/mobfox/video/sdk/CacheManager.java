public class com.mobfox.video.sdk.CacheManager implements java.io.Serializable {
	 /* .source "CacheManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/CacheManager$Item; */
	 /* } */
} // .end annotation
/* # static fields */
public static com.mobfox.video.sdk.CacheManager sCache;
private static final Long serialVersionUID;
/* # instance fields */
Boolean mCancel;
org.apache.http.client.methods.HttpGet mDownloadGet;
java.lang.Runnable mDownloadRunnable;
Boolean mDownloading;
com.mobfox.video.sdk.MobFoxAdManager mManager;
public java.lang.String mPath;
com.mobfox.video.sdk.CacheManager$Item m_end;
java.lang.Object m_listLock;
java.util.Map m_map;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/mobfox/video/sdk/CacheManager$Item;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Integer m_maxSize;
com.mobfox.video.sdk.CacheManager$Item m_start;
/* # direct methods */
static com.mobfox.video.sdk.CacheManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
int v0 = 0; // const/4 v0, 0x0
/* .line 35 */
return;
} // .end method
public com.mobfox.video.sdk.CacheManager ( ) {
/* .locals 2 */
/* .param p1, "manager" # Lcom/mobfox/video/sdk/MobFoxAdManager; */
/* .param p2, "maxObjects" # I */
/* .param p3, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 174 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 42 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
java.util.Collections .synchronizedMap ( v0 );
this.m_map = v0;
/* .line 46 */
/* new-instance v0, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* invoke-direct {v0}, Lcom/mobfox/video/sdk/CacheManager$Item;-><init>()V */
this.m_start = v0;
/* .line 47 */
/* new-instance v0, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* invoke-direct {v0}, Lcom/mobfox/video/sdk/CacheManager$Item;-><init>()V */
this.m_end = v0;
/* .line 49 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
this.m_listLock = v0;
/* .line 175 */
this.mPath = p3;
/* .line 176 */
/* iput p2, p0, Lcom/mobfox/video/sdk/CacheManager;->m_maxSize:I */
/* .line 177 */
v0 = this.m_start;
v1 = this.m_end;
this.next = v1;
/* .line 178 */
v0 = this.m_end;
v1 = this.m_start;
this.previous = v1;
/* .line 179 */
this.mManager = p1;
/* .line 180 */
return;
} // .end method
private void cleanFiles ( ) {
/* .locals 9 */
/* .prologue */
/* .line 148 */
/* new-instance v0, Ljava/io/File; */
v8 = this.mPath;
/* invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 149 */
/* .local v0, "dir":Ljava/io/File; */
v8 = (( java.io.File ) v0 ).isDirectory ( ); // invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 150 */
(( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* .line 151 */
/* .local v2, "filesArray":[Ljava/io/File; */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i":I */
} // :goto_0
/* array-length v8, v2 */
/* if-lt v4, v8, :cond_1 */
/* .line 170 */
} // .end local v2 # "filesArray":[Ljava/io/File;
} // .end local v4 # "i":I
} // :cond_0
return;
/* .line 152 */
/* .restart local v2 # "filesArray":[Ljava/io/File; */
/* .restart local v4 # "i":I */
} // :cond_1
/* aget-object v1, v2, v4 */
/* .line 153 */
/* .local v1, "f":Ljava/io/File; */
(( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
/* .line 154 */
/* .local v7, "name":Ljava/lang/String; */
final String v8 = "cache.dat"; // const-string v8, "cache.dat"
v8 = (( java.lang.String ) v8 ).equals ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v8, :cond_3 */
final String v8 = ".nomedia"; // const-string v8, ".nomedia"
v8 = (( java.lang.String ) v8 ).equals ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v8, :cond_3 */
/* .line 155 */
v8 = this.m_map;
/* .line 156 */
/* .local v5, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/mobfox/video/sdk/CacheManager$Item;>;" */
int v3 = 0; // const/4 v3, 0x0
/* .line 157 */
/* .local v3, "found":Z */
v8 = } // :cond_2
/* if-nez v8, :cond_4 */
/* .line 164 */
} // :goto_1
/* if-nez v3, :cond_3 */
/* .line 165 */
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
/* .line 151 */
} // .end local v3 # "found":Z
} // .end local v5 # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/mobfox/video/sdk/CacheManager$Item;>;"
} // :cond_3
/* add-int/lit8 v4, v4, 0x1 */
/* .line 158 */
/* .restart local v3 # "found":Z */
/* .restart local v5 # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/mobfox/video/sdk/CacheManager$Item;>;" */
} // :cond_4
/* check-cast v6, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .line 159 */
/* .local v6, "item":Lcom/mobfox/video/sdk/CacheManager$Item; */
v8 = this.value;
v8 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 160 */
int v3 = 1; // const/4 v3, 0x1
/* .line 161 */
} // .end method
private java.lang.String convertToHex ( Object[] p0 ) {
/* .locals 6 */
/* .param p1, "data" # [B */
/* .prologue */
/* .line 450 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 451 */
/* .local v0, "buf":Ljava/lang/StringBuffer; */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_0
/* array-length v5, p1 */
/* if-lt v2, v5, :cond_0 */
/* .line 462 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 452 */
} // :cond_0
/* aget-byte v5, p1, v2 */
/* ushr-int/lit8 v5, v5, 0x4 */
/* and-int/lit8 v1, v5, 0xf */
/* .line 453 */
/* .local v1, "halfbyte":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "two_halfs":I */
/* move v4, v3 */
/* .line 455 */
} // .end local v3 # "two_halfs":I
/* .local v4, "two_halfs":I */
} // :goto_1
/* if-ltz v1, :cond_1 */
/* const/16 v5, 0x9 */
/* if-gt v1, v5, :cond_1 */
/* .line 456 */
/* add-int/lit8 v5, v1, 0x30 */
/* int-to-char v5, v5 */
(( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 459 */
} // :goto_2
/* aget-byte v5, p1, v2 */
/* and-int/lit8 v1, v5, 0xf */
/* .line 460 */
/* add-int/lit8 v3, v4, 0x1 */
} // .end local v4 # "two_halfs":I
/* .restart local v3 # "two_halfs":I */
int v5 = 1; // const/4 v5, 0x1
/* if-lt v4, v5, :cond_2 */
/* .line 451 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 458 */
} // .end local v3 # "two_halfs":I
/* .restart local v4 # "two_halfs":I */
} // :cond_1
/* add-int/lit8 v5, v1, -0xa */
/* add-int/lit8 v5, v5, 0x61 */
/* int-to-char v5, v5 */
(( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // .end local v4 # "two_halfs":I
/* .restart local v3 # "two_halfs":I */
} // :cond_2
/* move v4, v3 */
} // .end local v3 # "two_halfs":I
/* .restart local v4 # "two_halfs":I */
} // .end method
public static com.mobfox.video.sdk.CacheManager getInstance ( com.mobfox.video.sdk.MobFoxAdManager p0 ) {
/* .locals 21 */
/* .param p0, "mobfoxManager" # Lcom/mobfox/video/sdk/MobFoxAdManager; */
/* .prologue */
/* .line 102 */
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context; */
/* .line 103 */
/* .local v9, "ctx":Landroid/content/Context; */
v19 = com.mobfox.video.sdk.CacheManager.sCache;
/* if-nez v19, :cond_4 */
/* .line 104 */
int v15 = 0; // const/4 v15, 0x0
/* .line 106 */
/* .local v15, "path":Ljava/lang/String; */
final String v19 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v19, "android.permission.WRITE_EXTERNAL_STORAGE"
/* move-object/from16 v0, v19 */
v18 = (( android.content.Context ) v9 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {v9, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 107 */
/* .local v18, "writePermission":I */
/* if-nez v18, :cond_2 */
/* .line 108 */
android.os.Environment .getExternalStorageState ( );
/* .line 109 */
/* .local v16, "sdState":Ljava/lang/String; */
final String v19 = "mounted"; // const-string v19, "mounted"
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v16 */
v19 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v19 != null) { // if-eqz v19, :cond_1
/* .line 110 */
/* new-instance v19, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v19 ..v19}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
/* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder; */
final String v20 = "/.vAd/"; // const-string v20, "/.vAd/"
/* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* .line 117 */
} // .end local v16 # "sdState":Ljava/lang/String;
} // :goto_0
/* new-instance v19, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v15 );
/* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v20 = ".nomedia"; // const-string v20, ".nomedia"
/* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* .line 118 */
/* .local v12, "file":Ljava/lang/String; */
/* new-instance v11, Ljava/io/File; */
/* invoke-direct {v11, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 119 */
/* .local v11, "f":Ljava/io/File; */
v19 = (( java.io.File ) v11 ).exists ( ); // invoke-virtual {v11}, Ljava/io/File;->exists()Z
/* if-nez v19, :cond_0 */
/* .line 120 */
(( java.io.File ) v11 ).mkdirs ( ); // invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z
/* .line 122 */
try { // :try_start_0
(( java.io.File ) v11 ).createNewFile ( ); // invoke-virtual {v11}, Ljava/io/File;->createNewFile()Z
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 126 */
} // :cond_0
} // :goto_1
/* new-instance v17, Landroid/os/StatFs; */
/* move-object/from16 v0, v17 */
/* invoke-direct {v0, v15}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V */
/* .line 127 */
/* .local v17, "stat":Landroid/os/StatFs; */
v19 = /* invoke-virtual/range {v17 ..v17}, Landroid/os/StatFs;->getBlockSize()I */
/* move/from16 v0, v19 */
/* int-to-long v5, v0 */
/* .line 128 */
/* .local v5, "blockSize":J */
v19 = /* invoke-virtual/range {v17 ..v17}, Landroid/os/StatFs;->getAvailableBlocks()I */
/* move/from16 v0, v19 */
/* int-to-long v3, v0 */
/* .line 129 */
/* .local v3, "availableBlocks":J */
/* mul-long v7, v3, v5 */
/* .line 130 */
/* .local v7, "bytesFree":J */
/* const-wide/32 v19, 0x1900000 */
/* cmp-long v19, v7, v19 */
/* if-gez v19, :cond_3 */
/* .line 131 */
/* const/16 v19, 0x0 */
/* .line 144 */
} // .end local v3 # "availableBlocks":J
} // .end local v5 # "blockSize":J
} // .end local v7 # "bytesFree":J
} // .end local v11 # "f":Ljava/io/File;
} // .end local v12 # "file":Ljava/lang/String;
} // .end local v15 # "path":Ljava/lang/String;
} // .end local v17 # "stat":Landroid/os/StatFs;
} // .end local v18 # "writePermission":I
} // :goto_2
/* .line 112 */
/* .restart local v15 # "path":Ljava/lang/String; */
/* .restart local v16 # "sdState":Ljava/lang/String; */
/* .restart local v18 # "writePermission":I */
} // :cond_1
/* new-instance v19, Ljava/lang/StringBuilder; */
(( android.content.Context ) v9 ).getFilesDir ( ); // invoke-virtual {v9}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
/* invoke-virtual/range {v20 ..v20}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String; */
/* invoke-static/range {v20 ..v20}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v20 = "/.vAd/"; // const-string v20, "/.vAd/"
/* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* .line 115 */
} // .end local v16 # "sdState":Ljava/lang/String;
} // :cond_2
/* new-instance v19, Ljava/lang/StringBuilder; */
(( android.content.Context ) v9 ).getFilesDir ( ); // invoke-virtual {v9}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
/* invoke-virtual/range {v20 ..v20}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String; */
/* invoke-static/range {v20 ..v20}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v20 = "/.vAd/"; // const-string v20, "/.vAd/"
/* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* .line 133 */
/* .restart local v3 # "availableBlocks":J */
/* .restart local v5 # "blockSize":J */
/* .restart local v7 # "bytesFree":J */
/* .restart local v11 # "f":Ljava/io/File; */
/* .restart local v12 # "file":Ljava/lang/String; */
/* .restart local v17 # "stat":Landroid/os/StatFs; */
} // :cond_3
/* new-instance v19, Lcom/mobfox/video/sdk/CacheManager; */
/* const/16 v20, 0xa */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v20 */
/* invoke-direct {v0, v1, v2, v15}, Lcom/mobfox/video/sdk/CacheManager;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager;ILjava/lang/String;)V */
/* .line 135 */
try { // :try_start_1
/* new-instance v13, Ljava/io/FileInputStream; */
/* new-instance v19, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v15 );
/* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v20 = "cache.dat"; // const-string v20, "cache.dat"
/* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v19 */
/* invoke-direct {v13, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* .line 136 */
/* .local v13, "fin":Ljava/io/FileInputStream; */
/* new-instance v14, Ljava/io/ObjectInputStream; */
/* invoke-direct {v14, v13}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 137 */
/* .local v14, "ois":Ljava/io/ObjectInputStream; */
v20 = com.mobfox.video.sdk.CacheManager.sCache;
(( java.io.ObjectInputStream ) v14 ).readObject ( ); // invoke-virtual {v14}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v19, Ljava/util/Map; */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v20 */
this.m_map = v0;
/* .line 138 */
(( java.io.ObjectInputStream ) v14 ).close ( ); // invoke-virtual {v14}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 142 */
} // .end local v13 # "fin":Ljava/io/FileInputStream;
} // .end local v14 # "ois":Ljava/io/ObjectInputStream;
} // :goto_3
v19 = com.mobfox.video.sdk.CacheManager.sCache;
/* invoke-direct/range {v19 ..v19}, Lcom/mobfox/video/sdk/CacheManager;->cleanFiles()V */
/* .line 144 */
} // .end local v3 # "availableBlocks":J
} // .end local v5 # "blockSize":J
} // .end local v7 # "bytesFree":J
} // .end local v11 # "f":Ljava/io/File;
} // .end local v12 # "file":Ljava/lang/String;
} // .end local v15 # "path":Ljava/lang/String;
} // .end local v17 # "stat":Landroid/os/StatFs;
} // .end local v18 # "writePermission":I
} // :cond_4
v19 = com.mobfox.video.sdk.CacheManager.sCache;
/* .line 139 */
/* .restart local v3 # "availableBlocks":J */
/* .restart local v5 # "blockSize":J */
/* .restart local v7 # "bytesFree":J */
/* .restart local v11 # "f":Ljava/io/File; */
/* .restart local v12 # "file":Ljava/lang/String; */
/* .restart local v15 # "path":Ljava/lang/String; */
/* .restart local v17 # "stat":Landroid/os/StatFs; */
/* .restart local v18 # "writePermission":I */
/* :catch_0 */
/* move-exception v10 */
/* .line 140 */
/* .local v10, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v10 ).printStackTrace ( ); // invoke-virtual {v10}, Ljava/lang/Exception;->printStackTrace()V
/* .line 123 */
} // .end local v3 # "availableBlocks":J
} // .end local v5 # "blockSize":J
} // .end local v7 # "bytesFree":J
} // .end local v10 # "e":Ljava/lang/Exception;
} // .end local v17 # "stat":Landroid/os/StatFs;
/* :catch_1 */
/* move-exception v19 */
/* goto/16 :goto_1 */
} // .end method
private java.lang.String saveFile ( java.io.InputStream p0 ) {
/* .locals 13 */
/* .param p1, "in" # Ljava/io/InputStream; */
/* .prologue */
/* .line 405 */
int v6 = 0; // const/4 v6, 0x0
/* .line 406 */
/* .local v6, "out":Ljava/io/OutputStream; */
int v4 = 0; // const/4 v4, 0x0
/* .line 407 */
/* .local v4, "md5":Ljava/lang/String; */
int v9 = 0; // const/4 v9, 0x0
/* .line 409 */
/* .local v9, "tmp":Ljava/io/File; */
try { // :try_start_0
/* new-instance v1, Ljava/io/File; */
v10 = this.mPath;
/* invoke-direct {v1, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 410 */
/* .local v1, "dir":Ljava/io/File; */
final String v10 = "cache"; // const-string v10, "cache"
final String v11 = ".tmp"; // const-string v11, ".tmp"
java.io.File .createTempFile ( v10,v11,v1 );
/* .line 411 */
final String v10 = "MD5"; // const-string v10, "MD5"
java.security.MessageDigest .getInstance ( v10 );
/* .line 412 */
/* .local v3, "md":Ljava/security/MessageDigest; */
/* new-instance v7, Ljava/io/BufferedOutputStream; */
/* new-instance v10, Ljava/io/FileOutputStream; */
/* invoke-direct {v10, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* const/16 v11, 0x2000 */
/* invoke-direct {v7, v10, v11}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_5 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 413 */
} // .end local v6 # "out":Ljava/io/OutputStream;
/* .local v7, "out":Ljava/io/OutputStream; */
/* const/16 v10, 0x2000 */
try { // :try_start_1
/* new-array v0, v10, [B */
/* .line 414 */
/* .local v0, "buffer":[B */
int v8 = 0; // const/4 v8, 0x0
/* .line 415 */
/* .local v8, "read":I */
} // :goto_0
int v10 = 0; // const/4 v10, 0x0
/* const/16 v11, 0x2000 */
v8 = (( java.io.InputStream ) p1 ).read ( v0, v10, v11 ); // invoke-virtual {p1, v0, v10, v11}, Ljava/io/InputStream;->read([BII)I
int v10 = -1; // const/4 v10, -0x1
/* if-gt v8, v10, :cond_2 */
/* .line 419 */
(( java.io.OutputStream ) v7 ).flush ( ); // invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 421 */
try { // :try_start_2
(( java.io.OutputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 425 */
} // :goto_1
int v6 = 0; // const/4 v6, 0x0
/* .line 426 */
} // .end local v7 # "out":Ljava/io/OutputStream;
/* .restart local v6 # "out":Ljava/io/OutputStream; */
try { // :try_start_3
(( java.security.MessageDigest ) v3 ).digest ( ); // invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B
/* .line 427 */
/* .local v5, "md5hash":[B */
/* invoke-direct {p0, v5}, Lcom/mobfox/video/sdk/CacheManager;->convertToHex([B)Ljava/lang/String; */
/* .line 428 */
v10 = (( java.io.File ) v9 ).exists ( ); // invoke-virtual {v9}, Ljava/io/File;->exists()Z
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 429 */
/* new-instance v10, Ljava/io/File; */
/* new-instance v11, Ljava/lang/StringBuilder; */
v12 = this.mPath;
java.lang.String .valueOf ( v12 );
/* invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v11 ).append ( v4 ); // invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v9 ).renameTo ( v10 ); // invoke-virtual {v9, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_5 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 438 */
} // :cond_0
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 440 */
try { // :try_start_4
(( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_4 */
} // :cond_1
} // :goto_2
/* move-object v10, v4 */
/* .line 446 */
} // .end local v0 # "buffer":[B
} // .end local v1 # "dir":Ljava/io/File;
} // .end local v3 # "md":Ljava/security/MessageDigest;
} // .end local v5 # "md5hash":[B
} // .end local v8 # "read":I
} // :goto_3
/* .line 416 */
} // .end local v6 # "out":Ljava/io/OutputStream;
/* .restart local v0 # "buffer":[B */
/* .restart local v1 # "dir":Ljava/io/File; */
/* .restart local v3 # "md":Ljava/security/MessageDigest; */
/* .restart local v7 # "out":Ljava/io/OutputStream; */
/* .restart local v8 # "read":I */
} // :cond_2
int v10 = 0; // const/4 v10, 0x0
try { // :try_start_5
(( java.security.MessageDigest ) v3 ).update ( v0, v10, v8 ); // invoke-virtual {v3, v0, v10, v8}, Ljava/security/MessageDigest;->update([BII)V
/* .line 417 */
int v10 = 0; // const/4 v10, 0x0
(( java.io.OutputStream ) v7 ).write ( v0, v10, v8 ); // invoke-virtual {v7, v0, v10, v8}, Ljava/io/OutputStream;->write([BII)V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_0 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 431 */
} // .end local v0 # "buffer":[B
} // .end local v8 # "read":I
/* :catch_0 */
/* move-exception v2 */
/* move-object v6, v7 */
/* .line 432 */
} // .end local v1 # "dir":Ljava/io/File;
} // .end local v3 # "md":Ljava/security/MessageDigest;
} // .end local v7 # "out":Ljava/io/OutputStream;
/* .local v2, "e":Ljava/lang/Exception; */
/* .restart local v6 # "out":Ljava/io/OutputStream; */
} // :goto_4
try { // :try_start_6
(( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
/* .line 433 */
if ( v9 != null) { // if-eqz v9, :cond_3
v10 = (( java.io.File ) v9 ).exists ( ); // invoke-virtual {v9}, Ljava/io/File;->exists()Z
if ( v10 != null) { // if-eqz v10, :cond_3
/* .line 434 */
(( java.io.File ) v9 ).delete ( ); // invoke-virtual {v9}, Ljava/io/File;->delete()Z
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
/* .line 438 */
} // :cond_3
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 440 */
try { // :try_start_7
(( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_2 */
/* .line 436 */
} // .end local v2 # "e":Ljava/lang/Exception;
} // :cond_4
} // :goto_5
int v10 = 0; // const/4 v10, 0x0
/* .line 422 */
} // .end local v6 # "out":Ljava/io/OutputStream;
/* .restart local v0 # "buffer":[B */
/* .restart local v1 # "dir":Ljava/io/File; */
/* .restart local v3 # "md":Ljava/security/MessageDigest; */
/* .restart local v7 # "out":Ljava/io/OutputStream; */
/* .restart local v8 # "read":I */
/* :catch_1 */
/* move-exception v2 */
/* .line 423 */
/* .local v2, "e":Ljava/io/IOException; */
try { // :try_start_8
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_0 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* .line 437 */
} // .end local v0 # "buffer":[B
} // .end local v2 # "e":Ljava/io/IOException;
} // .end local v8 # "read":I
/* :catchall_0 */
/* move-exception v10 */
/* move-object v6, v7 */
/* .line 438 */
} // .end local v1 # "dir":Ljava/io/File;
} // .end local v3 # "md":Ljava/security/MessageDigest;
} // .end local v7 # "out":Ljava/io/OutputStream;
/* .restart local v6 # "out":Ljava/io/OutputStream; */
} // :goto_6
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 440 */
try { // :try_start_9
(( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_3 */
/* .line 445 */
} // :cond_5
} // :goto_7
/* throw v10 */
/* .line 441 */
/* .local v2, "e":Ljava/lang/Exception; */
/* :catch_2 */
/* move-exception v2 */
/* .line 442 */
/* .local v2, "e":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* .line 441 */
} // .end local v2 # "e":Ljava/io/IOException;
/* :catch_3 */
/* move-exception v2 */
/* .line 442 */
/* .restart local v2 # "e":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* .line 441 */
} // .end local v2 # "e":Ljava/io/IOException;
/* .restart local v0 # "buffer":[B */
/* .restart local v1 # "dir":Ljava/io/File; */
/* .restart local v3 # "md":Ljava/security/MessageDigest; */
/* .restart local v5 # "md5hash":[B */
/* .restart local v8 # "read":I */
/* :catch_4 */
/* move-exception v2 */
/* .line 442 */
/* .restart local v2 # "e":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
/* .line 437 */
} // .end local v0 # "buffer":[B
} // .end local v1 # "dir":Ljava/io/File;
} // .end local v2 # "e":Ljava/io/IOException;
} // .end local v3 # "md":Ljava/security/MessageDigest;
} // .end local v5 # "md5hash":[B
} // .end local v8 # "read":I
/* :catchall_1 */
/* move-exception v10 */
/* .line 431 */
/* :catch_5 */
/* move-exception v2 */
} // .end method
private void updateExpiration ( java.lang.String p0, Long p1 ) {
/* .locals 3 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "validTime" # J */
/* .prologue */
/* .line 391 */
v1 = this.m_map;
/* check-cast v0, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .line 392 */
/* .local v0, "cur":Lcom/mobfox/video/sdk/CacheManager$Item; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 393 */
/* const-wide/16 v1, 0x0 */
/* cmp-long v1, p2, v1 */
/* if-lez v1, :cond_1 */
/* .line 394 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* add-long/2addr v1, p2 */
/* iput-wide v1, v0, Lcom/mobfox/video/sdk/CacheManager$Item;->expires:J */
/* .line 398 */
} // :goto_0
(( com.mobfox.video.sdk.CacheManager ) p0 ).moveToHead ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->moveToHead(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 399 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).save ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/CacheManager;->save()V
/* .line 401 */
} // :cond_0
return;
/* .line 396 */
} // :cond_1
/* const-wide v1, 0x7fffffffffffffffL */
/* iput-wide v1, v0, Lcom/mobfox/video/sdk/CacheManager$Item;->expires:J */
} // .end method
/* # virtual methods */
public void cancel ( ) {
/* .locals 2 */
/* .prologue */
/* .line 466 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/CacheManager;->mCancel:Z */
/* .line 467 */
v0 = this.mDownloadGet;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 468 */
v0 = this.mDownloadGet;
(( org.apache.http.client.methods.HttpGet ) v0 ).abort ( ); // invoke-virtual {v0}, Lorg/apache/http/client/methods/HttpGet;->abort()V
/* .line 469 */
int v0 = 0; // const/4 v0, 0x0
this.mDownloadGet = v0;
/* .line 471 */
} // :cond_0
v0 = this.mDownloadRunnable;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 472 */
v0 = this.mManager;
(( com.mobfox.video.sdk.MobFoxAdManager ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getHandler()Landroid/os/Handler;
v1 = this.mDownloadRunnable;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 474 */
} // :cond_1
return;
} // .end method
public void downloadVideo ( java.lang.String p0, java.lang.String p1, Long p2 ) {
/* .locals 11 */
/* .param p1, "userAgent" # Ljava/lang/String; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "expire" # J */
/* .prologue */
/* .line 333 */
int v3 = 0; // const/4 v3, 0x0
/* .line 334 */
/* .local v3, "in":Ljava/io/InputStream; */
(( com.mobfox.video.sdk.CacheManager ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Lcom/mobfox/video/sdk/CacheManager;->get(Ljava/lang/String;)Ljava/lang/String;
/* .line 335 */
/* .local v1, "hash":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 336 */
/* invoke-direct {p0, p2, p3, p4}, Lcom/mobfox/video/sdk/CacheManager;->updateExpiration(Ljava/lang/String;J)V */
/* .line 388 */
} // :cond_0
} // :goto_0
return;
/* .line 340 */
} // :cond_1
try { // :try_start_0
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
int v9 = 3; // const/4 v9, 0x3
v8 = android.util.Log .isLoggable ( v8,v9 );
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 341 */
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "Try to download video from Url:"; // const-string v10, "Try to download video from Url:"
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v9 ).append ( p2 ); // invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v8,v9 );
/* .line 343 */
} // :cond_2
/* new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 344 */
/* .local v2, "httpclient":Lorg/apache/http/client/HttpClient; */
/* .line 345 */
/* const/16 v9, 0x3a98 */
/* .line 344 */
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v8,v9 );
/* .line 346 */
/* .line 347 */
/* const/16 v9, 0x3a98 */
/* .line 346 */
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v8,v9 );
/* .line 348 */
/* new-instance v8, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v8, p2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
this.mDownloadGet = v8;
/* .line 349 */
v8 = this.mDownloadGet;
final String v9 = "Accept-Language"; // const-string v9, "Accept-Language"
final String v10 = "en"; // const-string v10, "en"
(( org.apache.http.client.methods.HttpGet ) v8 ).setHeader ( v9, v10 ); // invoke-virtual {v8, v9, v10}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
/* .line 350 */
v8 = this.mDownloadGet;
final String v9 = "Cookie"; // const-string v9, "Cookie"
final String v10 = ""; // const-string v10, ""
(( org.apache.http.client.methods.HttpGet ) v8 ).setHeader ( v9, v10 ); // invoke-virtual {v8, v9, v10}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
/* .line 351 */
v8 = this.mDownloadGet;
final String v9 = "User-Agent"; // const-string v9, "User-Agent"
(( org.apache.http.client.methods.HttpGet ) v8 ).setHeader ( v9, p1 ); // invoke-virtual {v8, v9, p1}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
/* .line 353 */
v8 = this.mDownloadGet;
/* .line 354 */
v7 = /* .local v6, "response":Lorg/apache/http/HttpResponse; */
/* .line 355 */
/* .local v7, "responseCode":I */
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
int v9 = 3; // const/4 v9, 0x3
v8 = android.util.Log .isLoggable ( v8,v9 );
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 356 */
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "Response "; // const-string v10, "Response "
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v9 ).append ( v7 ); // invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v10 = " Using User-Agent:"; // const-string v10, " Using User-Agent:"
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 357 */
(( java.lang.StringBuilder ) v9 ).append ( p1 ); // invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 356 */
android.util.Log .d ( v8,v9 );
/* .line 359 */
} // :cond_3
/* const/16 v8, 0xc8 */
/* if-ne v7, v8, :cond_7 */
/* .line 360 */
/* move-result-wide v4 */
/* .line 361 */
/* .local v4, "length":J */
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
int v9 = 3; // const/4 v9, 0x3
v8 = android.util.Log .isLoggable ( v8,v9 );
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 362 */
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "Download video file.Connection OK.Length:"; // const-string v10, "Download video file.Connection OK.Length:"
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 363 */
(( java.lang.StringBuilder ) v9 ).append ( v4, v5 ); // invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 362 */
android.util.Log .d ( v8,v9 );
/* .line 365 */
} // :cond_4
/* .line 366 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).put ( p2, p3, p4, v3 ); // invoke-virtual {p0, p2, p3, p4, v3}, Lcom/mobfox/video/sdk/CacheManager;->put(Ljava/lang/String;JLjava/io/InputStream;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 376 */
} // .end local v4 # "length":J
} // :cond_5
} // :goto_1
v8 = this.mDownloadGet;
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 377 */
v8 = this.mDownloadGet;
(( org.apache.http.client.methods.HttpGet ) v8 ).abort ( ); // invoke-virtual {v8}, Lorg/apache/http/client/methods/HttpGet;->abort()V
/* .line 378 */
int v8 = 0; // const/4 v8, 0x0
this.mDownloadGet = v8;
/* .line 380 */
} // :cond_6
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 382 */
try { // :try_start_1
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 385 */
} // :goto_2
int v3 = 0; // const/4 v3, 0x0
/* goto/16 :goto_0 */
/* .line 368 */
} // :cond_7
try { // :try_start_2
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
int v9 = 3; // const/4 v9, 0x3
v8 = android.util.Log .isLoggable ( v8,v9 );
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 369 */
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
final String v9 = "Server error downloading video file"; // const-string v9, "Server error downloading video file"
android.util.Log .d ( v8,v9 );
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 372 */
} // .end local v2 # "httpclient":Lorg/apache/http/client/HttpClient;
} // .end local v6 # "response":Lorg/apache/http/HttpResponse;
} // .end local v7 # "responseCode":I
/* :catch_0 */
/* move-exception v0 */
/* .line 373 */
/* .local v0, "e":Ljava/lang/Exception; */
try { // :try_start_3
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "Exception conecting to server to download video file"; // const-string v10, "Exception conecting to server to download video file"
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 374 */
(( java.lang.StringBuilder ) v9 ).append ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 373 */
android.util.Log .e ( v8,v9 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 376 */
v8 = this.mDownloadGet;
if ( v8 != null) { // if-eqz v8, :cond_8
/* .line 377 */
v8 = this.mDownloadGet;
(( org.apache.http.client.methods.HttpGet ) v8 ).abort ( ); // invoke-virtual {v8}, Lorg/apache/http/client/methods/HttpGet;->abort()V
/* .line 378 */
int v8 = 0; // const/4 v8, 0x0
this.mDownloadGet = v8;
/* .line 380 */
} // :cond_8
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 382 */
try { // :try_start_4
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 385 */
} // :goto_3
int v3 = 0; // const/4 v3, 0x0
/* goto/16 :goto_0 */
/* .line 375 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v8 */
/* .line 376 */
v9 = this.mDownloadGet;
if ( v9 != null) { // if-eqz v9, :cond_9
/* .line 377 */
v9 = this.mDownloadGet;
(( org.apache.http.client.methods.HttpGet ) v9 ).abort ( ); // invoke-virtual {v9}, Lorg/apache/http/client/methods/HttpGet;->abort()V
/* .line 378 */
int v9 = 0; // const/4 v9, 0x0
this.mDownloadGet = v9;
/* .line 380 */
} // :cond_9
if ( v3 != null) { // if-eqz v3, :cond_a
/* .line 382 */
try { // :try_start_5
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_2 */
/* .line 385 */
} // :goto_4
int v3 = 0; // const/4 v3, 0x0
/* .line 387 */
} // :cond_a
/* throw v8 */
/* .line 383 */
/* .restart local v0 # "e":Ljava/lang/Exception; */
/* :catch_1 */
/* move-exception v8 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* :catch_2 */
/* move-exception v9 */
/* .restart local v2 # "httpclient":Lorg/apache/http/client/HttpClient; */
/* .restart local v6 # "response":Lorg/apache/http/HttpResponse; */
/* .restart local v7 # "responseCode":I */
/* :catch_3 */
/* move-exception v8 */
} // .end method
public void downloadVideoInfo ( com.mobfox.video.sdk.RequestData p0 ) {
/* .locals 2 */
/* .param p1, "requestData" # Lcom/mobfox/video/sdk/RequestData; */
/* .prologue */
/* .line 284 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/CacheManager;->mDownloading:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 330 */
} // :goto_0
return;
/* .line 286 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/mobfox/video/sdk/CacheManager;->mDownloading:Z */
/* .line 287 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/mobfox/video/sdk/CacheManager$1; */
/* invoke-direct {v1, p0, p1}, Lcom/mobfox/video/sdk/CacheManager$1;-><init>(Lcom/mobfox/video/sdk/CacheManager;Lcom/mobfox/video/sdk/RequestData;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 329 */
/* .local v0, "downloadThread":Ljava/lang/Thread; */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // .end method
public java.lang.String get ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p1, "key" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 187 */
v3 = this.m_map;
/* check-cast v0, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .line 188 */
/* .local v0, "cur":Lcom/mobfox/video/sdk/CacheManager$Item; */
/* if-nez v0, :cond_0 */
/* .line 200 */
} // :goto_0
/* .line 191 */
} // :cond_0
/* new-instance v1, Ljava/io/File; */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = this.mPath;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.value;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 192 */
/* .local v1, "f":Ljava/io/File; */
v3 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v3 != null) { // if-eqz v3, :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iget-wide v5, v0, Lcom/mobfox/video/sdk/CacheManager$Item;->expires:J */
/* cmp-long v3, v3, v5 */
/* if-lez v3, :cond_2 */
/* .line 193 */
} // :cond_1
v3 = this.m_map;
v4 = this.key;
/* .line 194 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).removeItem ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->removeItem(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 197 */
} // :cond_2
v2 = this.m_start;
v2 = this.next;
/* if-eq v0, v2, :cond_3 */
/* .line 198 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).moveToHead ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->moveToHead(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 200 */
} // :cond_3
v2 = this.value;
} // .end method
public java.lang.String getPath ( ) {
/* .locals 1 */
/* .prologue */
/* .line 183 */
v0 = this.mPath;
} // .end method
public java.lang.String getPath ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p1, "key" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 204 */
v3 = this.m_map;
/* check-cast v0, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .line 205 */
/* .local v0, "cur":Lcom/mobfox/video/sdk/CacheManager$Item; */
/* if-nez v0, :cond_0 */
/* .line 217 */
} // :goto_0
/* .line 208 */
} // :cond_0
/* new-instance v1, Ljava/io/File; */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = this.mPath;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.value;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 209 */
/* .local v1, "f":Ljava/io/File; */
v3 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v3 != null) { // if-eqz v3, :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iget-wide v5, v0, Lcom/mobfox/video/sdk/CacheManager$Item;->expires:J */
/* cmp-long v3, v3, v5 */
/* if-lez v3, :cond_2 */
/* .line 210 */
} // :cond_1
v3 = this.m_map;
v4 = this.key;
/* .line 211 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).removeItem ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->removeItem(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 214 */
} // :cond_2
v2 = this.m_start;
v2 = this.next;
/* if-eq v0, v2, :cond_3 */
/* .line 215 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).moveToHead ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->moveToHead(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 217 */
} // :cond_3
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "file://"; // const-string v3, "file://"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.mPath;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.value;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
void insertHead ( com.mobfox.video.sdk.CacheManager$Item p0 ) {
/* .locals 2 */
/* .param p1, "item" # Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .prologue */
/* .line 81 */
v1 = this.m_listLock;
/* monitor-enter v1 */
/* .line 82 */
try { // :try_start_0
v0 = this.m_start;
this.previous = v0;
/* .line 83 */
v0 = this.m_start;
v0 = this.next;
this.next = v0;
/* .line 84 */
v0 = this.m_start;
v0 = this.next;
this.previous = p1;
/* .line 85 */
v0 = this.m_start;
this.next = p1;
/* .line 81 */
/* monitor-exit v1 */
/* .line 87 */
return;
/* .line 81 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
void moveToHead ( com.mobfox.video.sdk.CacheManager$Item p0 ) {
/* .locals 3 */
/* .param p1, "item" # Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .prologue */
/* .line 90 */
v1 = this.m_listLock;
/* monitor-enter v1 */
/* .line 91 */
try { // :try_start_0
v0 = this.previous;
v2 = this.next;
this.next = v2;
/* .line 92 */
v0 = this.next;
v2 = this.previous;
this.previous = v2;
/* .line 93 */
v0 = this.m_start;
this.previous = v0;
/* .line 94 */
v0 = this.m_start;
v0 = this.next;
this.next = v0;
/* .line 95 */
v0 = this.m_start;
v0 = this.next;
this.previous = p1;
/* .line 96 */
v0 = this.m_start;
this.next = p1;
/* .line 90 */
/* monitor-exit v1 */
/* .line 98 */
return;
/* .line 90 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public Boolean put ( java.lang.String p0, Long p1, java.io.InputStream p2 ) {
/* .locals 11 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "validTime" # J */
/* .param p4, "in" # Ljava/io/InputStream; */
/* .prologue */
/* const-wide/16 v9, 0x0 */
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
/* .line 221 */
v7 = this.m_map;
/* check-cast v0, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .line 222 */
/* .local v0, "cur":Lcom/mobfox/video/sdk/CacheManager$Item; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 223 */
/* invoke-direct {p0, p4}, Lcom/mobfox/video/sdk/CacheManager;->saveFile(Ljava/io/InputStream;)Ljava/lang/String; */
/* .line 224 */
/* .local v4, "md5":Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 225 */
this.value = v4;
/* .line 226 */
/* cmp-long v6, p2, v9 */
/* if-lez v6, :cond_0 */
/* .line 227 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v6 */
/* add-long/2addr v6, p2 */
/* iput-wide v6, v0, Lcom/mobfox/video/sdk/CacheManager$Item;->expires:J */
/* .line 231 */
} // :goto_0
(( com.mobfox.video.sdk.CacheManager ) p0 ).moveToHead ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->moveToHead(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 232 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).save ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/CacheManager;->save()V
/* .line 256 */
} // :goto_1
/* .line 229 */
} // :cond_0
/* const-wide v6, 0x7fffffffffffffffL */
/* iput-wide v6, v0, Lcom/mobfox/video/sdk/CacheManager$Item;->expires:J */
} // :cond_1
/* move v5, v6 */
/* .line 235 */
/* .line 237 */
} // .end local v4 # "md5":Ljava/lang/String;
} // :cond_2
v7 = v7 = this.m_map;
/* iget v8, p0, Lcom/mobfox/video/sdk/CacheManager;->m_maxSize:I */
/* if-lt v7, v8, :cond_3 */
/* .line 238 */
v7 = this.m_end;
v0 = this.previous;
/* .line 239 */
v7 = this.m_map;
v8 = this.key;
/* .line 240 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).removeItem ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->removeItem(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 242 */
} // :cond_3
/* const-wide/16 v1, 0x0 */
/* .line 243 */
/* .local v1, "expires":J */
/* cmp-long v7, p2, v9 */
/* if-lez v7, :cond_4 */
/* .line 244 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
/* add-long v1, v7, p2 */
/* .line 248 */
} // :goto_2
/* invoke-direct {p0, p4}, Lcom/mobfox/video/sdk/CacheManager;->saveFile(Ljava/io/InputStream;)Ljava/lang/String; */
/* .line 249 */
/* .restart local v4 # "md5":Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 250 */
/* new-instance v3, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* invoke-direct {v3, p1, v4, v1, v2}, Lcom/mobfox/video/sdk/CacheManager$Item;-><init>(Ljava/lang/String;Ljava/lang/String;J)V */
/* .line 251 */
/* .local v3, "item":Lcom/mobfox/video/sdk/CacheManager$Item; */
(( com.mobfox.video.sdk.CacheManager ) p0 ).insertHead ( v3 ); // invoke-virtual {p0, v3}, Lcom/mobfox/video/sdk/CacheManager;->insertHead(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 252 */
v6 = this.m_map;
/* .line 253 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).save ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/CacheManager;->save()V
/* .line 246 */
} // .end local v3 # "item":Lcom/mobfox/video/sdk/CacheManager$Item;
} // .end local v4 # "md5":Ljava/lang/String;
} // :cond_4
/* const-wide v1, 0x7fffffffffffffffL */
/* .restart local v4 # "md5":Ljava/lang/String; */
} // :cond_5
/* move v5, v6 */
/* .line 256 */
} // .end method
public void remove ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 260 */
v1 = this.m_map;
/* check-cast v0, Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .line 261 */
/* .local v0, "cur":Lcom/mobfox/video/sdk/CacheManager$Item; */
/* if-nez v0, :cond_0 */
/* .line 267 */
} // :goto_0
return;
/* .line 264 */
} // :cond_0
v1 = this.m_map;
/* .line 265 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).removeItem ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/CacheManager;->removeItem(Lcom/mobfox/video/sdk/CacheManager$Item;)V
/* .line 266 */
(( com.mobfox.video.sdk.CacheManager ) p0 ).save ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/CacheManager;->save()V
} // .end method
void removeItem ( com.mobfox.video.sdk.CacheManager$Item p0 ) {
/* .locals 4 */
/* .param p1, "item" # Lcom/mobfox/video/sdk/CacheManager$Item; */
/* .prologue */
/* .line 73 */
v1 = this.m_listLock;
/* monitor-enter v1 */
/* .line 74 */
try { // :try_start_0
v0 = this.previous;
v2 = this.next;
this.next = v2;
/* .line 75 */
v0 = this.next;
v2 = this.previous;
this.previous = v2;
/* .line 76 */
/* new-instance v0, Ljava/io/File; */
/* new-instance v2, Ljava/lang/StringBuilder; */
v3 = this.mPath;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.value;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* .line 73 */
/* monitor-exit v1 */
/* .line 78 */
return;
/* .line 73 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void save ( ) {
/* .locals 4 */
/* .prologue */
/* .line 275 */
try { // :try_start_0
/* new-instance v0, Ljava/io/FileOutputStream; */
/* new-instance v2, Ljava/lang/StringBuilder; */
v3 = this.mPath;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "cache.dat"; // const-string v3, "cache.dat"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
/* .line 276 */
/* .local v0, "fout":Ljava/io/FileOutputStream; */
/* new-instance v1, Ljava/io/ObjectOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 277 */
/* .local v1, "oos":Ljava/io/ObjectOutputStream; */
v2 = this.m_map;
(( java.io.ObjectOutputStream ) v1 ).writeObject ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 278 */
(( java.io.ObjectOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 281 */
} // .end local v0 # "fout":Ljava/io/FileOutputStream;
} // .end local v1 # "oos":Ljava/io/ObjectOutputStream;
} // :goto_0
return;
/* .line 279 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .prologue */
/* .line 270 */
v0 = v0 = this.m_map;
} // .end method
