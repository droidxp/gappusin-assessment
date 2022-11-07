class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 Long a;
	 com.flurry.android.p b;
	 java.lang.String c;
	 java.lang.String d;
	 Integer e;
	 com.flurry.android.AdImage f;
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 /* iput-wide p1, p0, Lcom/flurry/android/u;->a:J */
		 /* .line 19 */
		 this.b = p3;
		 /* .line 20 */
		 this.c = p5;
		 /* .line 21 */
		 this.f = p4;
		 /* .line 22 */
		 this.d = p6;
		 /* .line 23 */
		 /* iput p7, p0, Lcom/flurry/android/u;->e:I */
		 /* .line 24 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String toString ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 33 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 34 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "[id="; // const-string v2, "[id="
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-wide v2, p0, Lcom/flurry/android/u;->a:J */
		 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = ",name="; // const-string v3, ",name="
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v3 = this.c;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v3 = "]"; // const-string v3, "]"
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 36 */
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
