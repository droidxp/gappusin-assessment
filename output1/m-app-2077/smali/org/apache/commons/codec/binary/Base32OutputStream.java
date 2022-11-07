public class org.apache.commons.codec.binary.Base32OutputStream extends org.apache.commons.codec.binary.BaseNCodecOutputStream {
	 /* .source "Base32OutputStream.java" */
	 /* # direct methods */
	 public org.apache.commons.codec.binary.Base32OutputStream ( ) {
		 /* .locals 1 */
		 /* .param p1, "out" # Ljava/io/OutputStream; */
		 /* .prologue */
		 /* .line 48 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p0, p1, v0}, Lorg/apache/commons/codec/binary/Base32OutputStream;-><init>(Ljava/io/OutputStream;Z)V */
		 /* .line 49 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.binary.Base32OutputStream ( ) {
		 /* .locals 2 */
		 /* .param p1, "out" # Ljava/io/OutputStream; */
		 /* .param p2, "doEncode" # Z */
		 /* .prologue */
		 /* .line 61 */
		 /* new-instance v0, Lorg/apache/commons/codec/binary/Base32; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lorg/apache/commons/codec/binary/Base32;-><init>(Z)V */
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;-><init>(Ljava/io/OutputStream;Lorg/apache/commons/codec/binary/BaseNCodec;Z)V */
		 /* .line 62 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.binary.Base32OutputStream ( ) {
		 /* .locals 1 */
		 /* .param p1, "out" # Ljava/io/OutputStream; */
		 /* .param p2, "doEncode" # Z */
		 /* .param p3, "lineLength" # I */
		 /* .param p4, "lineSeparator" # [B */
		 /* .prologue */
		 /* .line 82 */
		 /* new-instance v0, Lorg/apache/commons/codec/binary/Base32; */
		 /* invoke-direct {v0, p3, p4}, Lorg/apache/commons/codec/binary/Base32;-><init>(I[B)V */
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;-><init>(Ljava/io/OutputStream;Lorg/apache/commons/codec/binary/BaseNCodec;Z)V */
		 /* .line 83 */
		 return;
	 } // .end method
