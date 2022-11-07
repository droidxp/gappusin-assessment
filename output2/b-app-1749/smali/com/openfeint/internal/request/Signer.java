public class com.openfeint.internal.request.Signer {
	 /* .source "Signer.java" */
	 /* # instance fields */
	 private java.lang.String mAccessToken;
	 private java.lang.String mKey;
	 private java.lang.String mSecret;
	 private java.lang.String mSigningKey;
	 /* # direct methods */
	 public com.openfeint.internal.request.Signer ( ) {
		 /* .locals 2 */
		 /* .param p1, "key" # Ljava/lang/String; */
		 /* .param p2, "secret" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 23 */
		 this.mKey = p1;
		 /* .line 24 */
		 this.mSecret = p2;
		 /* .line 25 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 v1 = this.mSecret;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "&"; // const-string v1, "&"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.mSigningKey = v0;
		 /* .line 26 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getKey ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 v0 = this.mKey;
	 } // .end method
	 public void setAccessToken ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .param p1, "token" # Ljava/lang/String; */
		 /* .param p2, "tokenSecret" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 29 */
		 this.mAccessToken = p1;
		 /* .line 30 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 v1 = this.mSecret;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "&"; // const-string v1, "&"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.mSigningKey = v0;
		 /* .line 31 */
		 return;
	 } // .end method
	 public java.lang.String sign ( java.lang.String p0, java.lang.String p1, Long p2, com.openfeint.internal.request.OrderedArgList p3 ) {
		 /* .locals 8 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "method" # Ljava/lang/String; */
		 /* .param p3, "secondsSinceEpoch" # J */
		 /* .param p5, "unsignedParams" # Lcom/openfeint/internal/request/OrderedArgList; */
		 /* .prologue */
		 /* const/16 v7, 0x2b */
		 /* .line 35 */
		 v5 = this.mAccessToken;
		 if ( v5 != null) { // if-eqz v5, :cond_0
			 final String v5 = "token"; // const-string v5, "token"
			 v6 = this.mAccessToken;
			 (( com.openfeint.internal.request.OrderedArgList ) p5 ).put ( v5, v6 ); // invoke-virtual {p5, v5, v6}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 37 */
		 } // :cond_0
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 38 */
		 /* .local v4, "sigbase":Ljava/lang/StringBuilder; */
		 (( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 39 */
		 (( java.lang.StringBuilder ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 40 */
		 v5 = this.mSecret;
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 41 */
		 (( java.lang.StringBuilder ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 42 */
		 (( java.lang.StringBuilder ) v4 ).append ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 43 */
		 (( java.lang.StringBuilder ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 45 */
		 (( com.openfeint.internal.request.OrderedArgList ) p5 ).getArgString ( ); // invoke-virtual {p5}, Lcom/openfeint/internal/request/OrderedArgList;->getArgString()Ljava/lang/String;
		 /* .line 46 */
		 /* .local v0, "argString":Ljava/lang/String; */
		 /* if-nez v0, :cond_1 */
		 final String v0 = ""; // const-string v0, ""
	 } // .end local v0 # "argString":Ljava/lang/String;
} // :cond_1
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 49 */
try { // :try_start_0
	 /* new-instance v2, Ljavax/crypto/spec/SecretKeySpec; */
	 v5 = this.mSigningKey;
	 final String v6 = "UTF-8"; // const-string v6, "UTF-8"
	 (( java.lang.String ) v5 ).getBytes ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 final String v6 = "HmacSHA1"; // const-string v6, "HmacSHA1"
	 /* invoke-direct {v2, v5, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
	 /* .line 50 */
	 /* .local v2, "key":Ljavax/crypto/spec/SecretKeySpec; */
	 final String v5 = "HmacSHA1"; // const-string v5, "HmacSHA1"
	 javax.crypto.Mac .getInstance ( v5 );
	 /* .line 51 */
	 /* .local v3, "mac":Ljavax/crypto/Mac; */
	 (( javax.crypto.Mac ) v3 ).init ( v2 ); // invoke-virtual {v3, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
	 /* .line 52 */
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v6 = "UTF-8"; // const-string v6, "UTF-8"
	 (( java.lang.String ) v5 ).getBytes ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 (( javax.crypto.Mac ) v3 ).doFinal ( v5 ); // invoke-virtual {v3, v5}, Ljavax/crypto/Mac;->doFinal([B)[B
	 /* .line 53 */
	 /* .local v1, "bytes":[B */
	 /* new-instance v5, Ljava/lang/String; */
	 org.apache.commons.codec.binary.Base64 .encodeBase64 ( v1 );
	 /* invoke-direct {v5, v6}, Ljava/lang/String;-><init>([B)V */
	 final String v6 = "\r\n"; // const-string v6, "\r\n"
	 final String v7 = ""; // const-string v7, ""
	 (( java.lang.String ) v5 ).replace ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/security/InvalidKeyException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 59 */
} // .end local v1 # "bytes":[B
} // .end local v2 # "key":Ljavax/crypto/spec/SecretKeySpec;
} // .end local v3 # "mac":Ljavax/crypto/Mac;
} // :goto_0
/* .line 56 */
/* :catch_0 */
/* move-exception v5 */
/* .line 59 */
} // :goto_1
int v5 = 0; // const/4 v5, 0x0
/* .line 55 */
/* :catch_1 */
/* move-exception v5 */
/* .line 54 */
/* :catch_2 */
/* move-exception v5 */
} // .end method
