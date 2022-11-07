public class com.google.ads.b {
	 /* .source "SourceFile" */
	 /* # static fields */
	 private static com.google.ads.b c;
	 /* # instance fields */
	 private final java.math.BigInteger a;
	 private java.math.BigInteger b;
	 /* # direct methods */
	 static com.google.ads.b ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 42 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 private com.google.ads.b ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 71 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 39 */
		 v0 = java.math.BigInteger.ONE;
		 this.b = v0;
		 /* .line 72 */
		 com.google.ads.b .d ( );
		 this.a = v0;
		 /* .line 73 */
		 return;
	 } // .end method
	 public static synchronized com.google.ads.b a ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 48 */
		 /* const-class v1, Lcom/google/ads/b; */
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 v0 = com.google.ads.b.c;
			 /* if-nez v0, :cond_0 */
			 /* .line 49 */
			 /* new-instance v0, Lcom/google/ads/b; */
			 /* invoke-direct {v0}, Lcom/google/ads/b;-><init>()V */
			 /* .line 51 */
		 } // :cond_0
		 v0 = com.google.ads.b.c;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit v1 */
		 /* .line 48 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit v1 */
		 /* throw v0 */
	 } // .end method
	 private static a ( Long p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 117 */
		 java.math.BigInteger .valueOf ( p0,p1 );
		 (( java.math.BigInteger ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B
	 } // .end method
	 private static java.math.BigInteger d ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* .line 96 */
		 try { // :try_start_0
			 final String v0 = "MD5"; // const-string v0, "MD5"
			 java.security.MessageDigest .getInstance ( v0 );
			 /* .line 97 */
			 java.util.UUID .randomUUID ( );
			 /* .line 98 */
			 (( java.util.UUID ) v1 ).getLeastSignificantBits ( ); // invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J
			 /* move-result-wide v2 */
			 com.google.ads.b .a ( v2,v3 );
			 (( java.security.MessageDigest ) v0 ).update ( v2 ); // invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V
			 /* .line 99 */
			 (( java.util.UUID ) v1 ).getMostSignificantBits ( ); // invoke-virtual {v1}, Ljava/util/UUID;->getMostSignificantBits()J
			 /* move-result-wide v1 */
			 com.google.ads.b .a ( v1,v2 );
			 (( java.security.MessageDigest ) v0 ).update ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V
			 /* .line 100 */
			 /* const/16 v1, 0x9 */
			 /* new-array v1, v1, [B */
			 /* .line 105 */
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 0; // const/4 v3, 0x0
			 /* aput-byte v3, v1, v2 */
			 /* .line 106 */
			 (( java.security.MessageDigest ) v0 ).digest ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 1; // const/4 v3, 0x1
			 /* const/16 v4, 0x8 */
			 java.lang.System .arraycopy ( v0,v2,v1,v3,v4 );
			 /* .line 107 */
			 /* new-instance v0, Ljava/math/BigInteger; */
			 /* invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V */
			 /* :try_end_0 */
			 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 108 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 109 */
			 /* new-instance v0, Ljava/lang/RuntimeException; */
			 final String v1 = "Cannot find MD5 message digest algorithm."; // const-string v1, "Cannot find MD5 message digest algorithm."
			 /* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
			 /* throw v0 */
		 } // .end method
		 /* # virtual methods */
		 public synchronized java.math.BigInteger b ( ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 58 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 v0 = this.a;
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit p0 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 public synchronized java.math.BigInteger c ( ) {
				 /* .locals 3 */
				 /* .prologue */
				 /* .line 66 */
				 /* monitor-enter p0 */
				 try { // :try_start_0
					 v0 = this.b;
					 /* .line 67 */
					 v1 = this.b;
					 v2 = java.math.BigInteger.ONE;
					 (( java.math.BigInteger ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;
					 this.b = v1;
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 68 */
					 /* monitor-exit p0 */
					 /* .line 66 */
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* monitor-exit p0 */
					 /* throw v0 */
				 } // .end method
