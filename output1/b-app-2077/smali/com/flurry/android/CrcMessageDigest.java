public class com.flurry.android.CrcMessageDigest extends java.security.MessageDigest {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 private java.util.zip.CRC32 a;
	 /* # direct methods */
	 public com.flurry.android.CrcMessageDigest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 13 */
		 final String v0 = "CRC"; // const-string v0, "CRC"
		 /* invoke-direct {p0, v0}, Ljava/security/MessageDigest;-><init>(Ljava/lang/String;)V */
		 /* .line 9 */
		 /* new-instance v0, Ljava/util/zip/CRC32; */
		 /* invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V */
		 this.a = v0;
		 /* .line 14 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected engineDigest ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* .line 37 */
		 v0 = this.a;
		 (( java.util.zip.CRC32 ) v0 ).getValue ( ); // invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J
		 /* move-result-wide v0 */
		 /* .line 38 */
		 int v2 = 4; // const/4 v2, 0x4
		 /* new-array v2, v2, [B */
		 /* .line 39 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* const-wide/32 v4, -0x1000000 */
		 /* and-long/2addr v4, v0 */
		 /* const/16 v6, 0x18 */
		 /* shr-long/2addr v4, v6 */
		 /* long-to-int v4, v4 */
		 /* int-to-byte v4, v4 */
		 /* aput-byte v4, v2, v3 */
		 /* .line 40 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* const-wide/32 v4, 0xff0000 */
		 /* and-long/2addr v4, v0 */
		 /* const/16 v6, 0x10 */
		 /* shr-long/2addr v4, v6 */
		 /* long-to-int v4, v4 */
		 /* int-to-byte v4, v4 */
		 /* aput-byte v4, v2, v3 */
		 /* .line 41 */
		 int v3 = 2; // const/4 v3, 0x2
		 /* const-wide/32 v4, 0xff00 */
		 /* and-long/2addr v4, v0 */
		 /* const/16 v6, 0x8 */
		 /* shr-long/2addr v4, v6 */
		 /* long-to-int v4, v4 */
		 /* int-to-byte v4, v4 */
		 /* aput-byte v4, v2, v3 */
		 /* .line 42 */
		 int v3 = 3; // const/4 v3, 0x3
		 /* const-wide/16 v4, 0xff */
		 /* and-long/2addr v0, v4 */
		 /* long-to-int v0, v0 */
		 /* int-to-byte v0, v0 */
		 /* aput-byte v0, v2, v3 */
		 /* .line 43 */
	 } // .end method
	 protected void engineReset ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 19 */
		 v0 = this.a;
		 (( java.util.zip.CRC32 ) v0 ).reset ( ); // invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V
		 /* .line 20 */
		 return;
	 } // .end method
	 protected void engineUpdate ( Object p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 25 */
		 v0 = this.a;
		 (( java.util.zip.CRC32 ) v0 ).update ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/zip/CRC32;->update(I)V
		 /* .line 26 */
		 return;
	 } // .end method
	 protected void engineUpdate ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 31 */
		 v0 = this.a;
		 (( java.util.zip.CRC32 ) v0 ).update ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V
		 /* .line 32 */
		 return;
	 } // .end method
	 public Integer getChecksum ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 53 */
		 (( com.flurry.android.CrcMessageDigest ) p0 ).engineDigest ( ); // invoke-virtual {p0}, Lcom/flurry/android/CrcMessageDigest;->engineDigest()[B
		 java.nio.ByteBuffer .wrap ( v0 );
		 /* .line 54 */
		 v0 = 		 (( java.nio.ByteBuffer ) v0 ).getInt ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I
	 } // .end method
	 public getDigest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 48 */
		 (( com.flurry.android.CrcMessageDigest ) p0 ).engineDigest ( ); // invoke-virtual {p0}, Lcom/flurry/android/CrcMessageDigest;->engineDigest()[B
	 } // .end method
