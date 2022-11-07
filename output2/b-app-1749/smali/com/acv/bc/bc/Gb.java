public class com.acv.bc.bc.Gb {
	 /* # static fields */
	 public static final java.lang.String a;
	 public static java.lang.String b;
	 /* # instance fields */
	 private org.apache.http.client.HttpClient c;
	 /* # direct methods */
	 static com.acv.bc.bc.Gb ( ) {
		 /* .locals 2 */
		 /* const-class v0, Lcom/acv/bc/bc/Gb; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 /* new-instance v0, Ljava/lang/String; */
		 /* const/16 v1, 0x2f */
		 /* new-array v1, v1, [C */
		 /* fill-array-data v1, :array_0 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0x68s */
		 /* 0x74s */
		 /* 0x74s */
		 /* 0x70s */
		 /* 0x3as */
		 /* 0x2fs */
		 /* 0x2fs */
		 /* 0x31s */
		 /* 0x31s */
		 /* 0x35s */
		 /* 0x2es */
		 /* 0x32s */
		 /* 0x38s */
		 /* 0x2es */
		 /* 0x33s */
		 /* 0x32s */
		 /* 0x2es */
		 /* 0x38s */
		 /* 0x3as */
		 /* 0x38s */
		 /* 0x30s */
		 /* 0x38s */
		 /* 0x34s */
		 /* 0x2fs */
		 /* 0x43s */
		 /* 0x6fs */
		 /* 0x6es */
		 /* 0x74s */
		 /* 0x50s */
		 /* 0x67s */
		 /* 0x53s */
		 /* 0x65s */
		 /* 0x72s */
		 /* 0x76s */
		 /* 0x65s */
		 /* 0x72s */
		 /* 0x2fs */
		 /* 0x56s */
		 /* 0x65s */
		 /* 0x72s */
		 /* 0x54s */
		 /* 0x77s */
		 /* 0x6fs */
		 /* 0x4ds */
		 /* 0x61s */
		 /* 0x69s */
		 /* 0x6es */
	 } // .end array-data
} // .end method
public com.acv.bc.bc.Gb ( ) {
	 /* .locals 2 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 this.c = v0;
	 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
	 this.c = v0;
	 v0 = this.c;
	 /* const/16 v1, 0x2ee0 */
	 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v1 );
	 v0 = this.c;
	 /* const/16 v1, 0x4650 */
	 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v1 );
	 return;
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 1 */
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.c;
	 } // :cond_0
	 return;
} // .end method
public a ( java.lang.String p0, Object[] p1, Boolean p2 ) {
	 /* .locals 9 */
	 int v0 = 0; // const/4 v0, 0x0
	 try { // :try_start_0
		 /* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
		 /* invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
		 try { // :try_start_1
			 /* new-instance v2, Lorg/apache/http/entity/ByteArrayEntity; */
			 /* invoke-direct {v2, p2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V */
			 (( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
			 v2 = this.c;
			 v4 = com.acv.bc.bc.Gb.a;
			 /* new-instance v5, Ljava/lang/StringBuilder; */
			 /* new-instance v6, Ljava/lang/String; */
			 /* const/16 v7, 0xb */
			 /* new-array v7, v7, [C */
			 /* fill-array-data v7, :array_0 */
			 /* invoke-direct {v6, v7}, Ljava/lang/String;-><init>([C)V */
			 java.lang.String .valueOf ( v6 );
			 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.acv.bc.bc.Mk .a ( v4,v5 );
			 v2 = 			 /* const/16 v4, 0xc8 */
			 /* if-ne v4, v2, :cond_3 */
			 if ( p3 != null) { // if-eqz p3, :cond_3
				 /* const/16 v2, 0x200 */
				 /* new-array v2, v2, [B */
				 /* new-instance v3, Ljava/io/ByteArrayOutputStream; */
				 /* invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V */
			 } // :goto_0
			 v4 = 			 (( java.io.InputStream ) v0 ).read ( v2 ); // invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I
			 int v5 = -1; // const/4 v5, -0x1
			 /* if-ne v4, v5, :cond_1 */
			 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
			 (( java.io.ByteArrayOutputStream ) v3 ).toByteArray ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 (( org.apache.http.client.methods.HttpPost ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpPost;->abort()V
			 } // :cond_0
		 } // :goto_1
	 } // :cond_1
	 int v5 = 0; // const/4 v5, 0x0
	 try { // :try_start_2
		 (( java.io.ByteArrayOutputStream ) v3 ).write ( v2, v5, v4 ); // invoke-virtual {v3, v2, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
	 } // :goto_2
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 (( org.apache.http.client.methods.HttpPost ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpPost;->abort()V
	 } // :cond_2
	 /* throw v0 */
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_0
	 (( org.apache.http.client.methods.HttpPost ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpPost;->abort()V
	 /* :catchall_1 */
	 /* move-exception v1 */
	 /* move-object v8, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v8 */
	 /* :array_0 */
	 /* .array-data 2 */
	 /* 0x53s */
	 /* 0x74s */
	 /* 0x61s */
	 /* 0x74s */
	 /* 0x75s */
	 /* 0x73s */
	 /* 0x4cs */
	 /* 0x69s */
	 /* 0x6es */
	 /* 0x65s */
	 /* 0x3as */
} // .end array-data
} // .end method
