class org.apache.commons.codec.net.Utils {
	 /* .source "Utils.java" */
	 /* # direct methods */
	 org.apache.commons.codec.net.Utils ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static Integer digit16 ( Object p0 ) {
		 /* .locals 4 */
		 /* .param p0, "b" # B */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/apache/commons/codec/DecoderException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 43 */
	 /* int-to-char v1, p0 */
	 /* const/16 v2, 0x10 */
	 v0 = 	 java.lang.Character .digit ( v1,v2 );
	 /* .line 44 */
	 /* .local v0, "i":I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-ne v0, v1, :cond_0 */
	 /* .line 45 */
	 /* new-instance v1, Lorg/apache/commons/codec/DecoderException; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Invalid URL encoding: not a valid digit (radix 16): "; // const-string v3, "Invalid URL encoding: not a valid digit (radix 16): "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, v2}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
	 /* .line 47 */
} // :cond_0
} // .end method
