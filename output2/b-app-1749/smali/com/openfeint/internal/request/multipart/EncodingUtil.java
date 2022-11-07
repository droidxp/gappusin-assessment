public class com.openfeint.internal.request.multipart.EncodingUtil {
	 /* .source "EncodingUtil.java" */
	 /* # direct methods */
	 private com.openfeint.internal.request.multipart.EncodingUtil ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 135 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 136 */
		 return;
	 } // .end method
	 public static getAsciiBytes ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p0, "data" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 55 */
		 /* if-nez p0, :cond_0 */
		 /* .line 56 */
		 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
		 final String v2 = "Parameter may not be null"; // const-string v2, "Parameter may not be null"
		 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
		 /* .line 60 */
	 } // :cond_0
	 try { // :try_start_0
		 final String v1 = "US-ASCII"; // const-string v1, "US-ASCII"
		 (( java.lang.String ) p0 ).getBytes ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
		 /* :try_end_0 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 61 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 62 */
		 /* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
		 /* new-instance v1, Ljava/lang/RuntimeException; */
		 final String v2 = "HttpClient requires ASCII support"; // const-string v2, "HttpClient requires ASCII support"
		 /* invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
	 } // .end method
	 public static java.lang.String getAsciiString ( Object[] p0 ) {
		 /* .locals 2 */
		 /* .param p0, "data" # [B */
		 /* .prologue */
		 /* .line 102 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* array-length v1, p0 */
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiString ( p0,v0,v1 );
	 } // .end method
	 public static java.lang.String getAsciiString ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 /* .param p0, "data" # [B */
		 /* .param p1, "offset" # I */
		 /* .param p2, "length" # I */
		 /* .prologue */
		 /* .line 80 */
		 /* if-nez p0, :cond_0 */
		 /* .line 81 */
		 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
		 final String v2 = "Parameter may not be null"; // const-string v2, "Parameter may not be null"
		 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
		 /* .line 85 */
	 } // :cond_0
	 try { // :try_start_0
		 /* new-instance v1, Ljava/lang/String; */
		 final String v2 = "US-ASCII"; // const-string v2, "US-ASCII"
		 /* invoke-direct {v1, p0, p1, p2, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 86 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 87 */
		 /* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
		 /* new-instance v1, Ljava/lang/RuntimeException; */
		 final String v2 = "HttpClient requires ASCII support"; // const-string v2, "HttpClient requires ASCII support"
		 /* invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
	 } // .end method
	 public static getBytes ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .param p0, "data" # Ljava/lang/String; */
		 /* .param p1, "charset" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 117 */
		 /* if-nez p0, :cond_0 */
		 /* .line 118 */
		 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
		 final String v2 = "data may not be null"; // const-string v2, "data may not be null"
		 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
		 /* .line 121 */
	 } // :cond_0
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 v1 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* if-nez v1, :cond_2 */
		 /* .line 122 */
	 } // :cond_1
	 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
	 final String v2 = "charset may not be null or empty"; // const-string v2, "charset may not be null or empty"
	 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
	 /* .line 126 */
} // :cond_2
try { // :try_start_0
	 (( java.lang.String ) p0 ).getBytes ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 /* :try_end_0 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 128 */
} // :goto_0
/* .line 127 */
/* :catch_0 */
/* move-exception v0 */
/* .line 128 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
} // .end method
