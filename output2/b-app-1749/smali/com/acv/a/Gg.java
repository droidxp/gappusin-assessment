public class com.acv.a.Gg {
	 /* # static fields */
	 public static final java.lang.String a;
	 /* # instance fields */
	 private org.apache.http.client.HttpClient b;
	 /* # direct methods */
	 static com.acv.a.Gg ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/acv/a/Gg; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public com.acv.a.Gg ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.b = v0;
		 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
		 this.b = v0;
		 v0 = this.b;
		 /* const/16 v1, 0x2ee0 */
		 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v1 );
		 v0 = this.b;
		 /* const/16 v1, 0x4650 */
		 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v1 );
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.b;
		 } // :cond_0
		 return;
	 } // .end method
	 public a ( java.lang.String p0 ) {
		 /* .locals 7 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 /* new-instance v1, Lorg/apache/http/client/methods/HttpGet; */
			 /* invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
			 try { // :try_start_1
				 v2 = this.b;
				 v4 = com.acv.a.Gg.a;
				 /* new-instance v5, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
				 (( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.acv.a.Aa .a ( v4,v5 );
				 v2 = 				 /* const/16 v4, 0xc8 */
				 /* if-ne v4, v2, :cond_3 */
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
				 (( org.apache.http.client.methods.HttpGet ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->abort()V
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
		 (( org.apache.http.client.methods.HttpGet ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->abort()V
	 } // :cond_2
	 /* throw v0 */
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_0
	 (( org.apache.http.client.methods.HttpGet ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->abort()V
	 /* :catchall_1 */
	 /* move-exception v1 */
	 /* move-object v6, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v6 */
} // .end method
public a ( java.lang.String p0, Object[] p1, Boolean p2 ) {
	 /* .locals 7 */
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
			 v2 = this.b;
			 v4 = com.acv.a.Gg.a;
			 /* new-instance v5, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.acv.a.Aa .a ( v4,v5 );
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
	 /* move-object v6, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v6 */
} // .end method
