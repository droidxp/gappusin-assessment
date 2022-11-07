public class org.apache.commons.codec.binary.Base32InputStream extends org.apache.commons.codec.binary.BaseNCodecInputStream {
	 /* .source "Base32InputStream.java" */
	 /* # direct methods */
	 public org.apache.commons.codec.binary.Base32InputStream ( ) {
		 /* .locals 1 */
		 /* .param p1, "in" # Ljava/io/InputStream; */
		 /* .prologue */
		 /* .line 48 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Lorg/apache/commons/codec/binary/Base32InputStream;-><init>(Ljava/io/InputStream;Z)V */
		 /* .line 49 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.binary.Base32InputStream ( ) {
		 /* .locals 2 */
		 /* .param p1, "in" # Ljava/io/InputStream; */
		 /* .param p2, "doEncode" # Z */
		 /* .prologue */
		 /* .line 61 */
		 /* new-instance v0, Lorg/apache/commons/codec/binary/Base32; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lorg/apache/commons/codec/binary/Base32;-><init>(Z)V */
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/apache/commons/codec/binary/BaseNCodecInputStream;-><init>(Ljava/io/InputStream;Lorg/apache/commons/codec/binary/BaseNCodec;Z)V */
		 /* .line 62 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.binary.Base32InputStream ( ) {
		 /* .locals 1 */
		 /* .param p1, "in" # Ljava/io/InputStream; */
		 /* .param p2, "doEncode" # Z */
		 /* .param p3, "lineLength" # I */
		 /* .param p4, "lineSeparator" # [B */
		 /* .prologue */
		 /* .line 82 */
		 /* new-instance v0, Lorg/apache/commons/codec/binary/Base32; */
		 /* invoke-direct {v0, p3, p4}, Lorg/apache/commons/codec/binary/Base32;-><init>(I[B)V */
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/apache/commons/codec/binary/BaseNCodecInputStream;-><init>(Ljava/io/InputStream;Lorg/apache/commons/codec/binary/BaseNCodec;Z)V */
		 /* .line 83 */
		 return;
	 } // .end method
