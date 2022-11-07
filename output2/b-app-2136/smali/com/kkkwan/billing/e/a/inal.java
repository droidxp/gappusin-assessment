public class inal {
	 /* # instance fields */
	 private java.lang.String a;
	 private java.lang.String b;
	 private java.lang.String c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 this.b = p2;
		 this.c = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 public final java.lang.String b ( ) {
		 /* .locals 1 */
		 v0 = this.b;
	 } // .end method
	 public final java.lang.String c ( ) {
		 /* .locals 1 */
		 v0 = this.c;
	 } // .end method
	 public final java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "UsedPipe [pipeId="; // const-string v1, "UsedPipe [pipeId="
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v1 = this.a;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = ", dayCount="; // const-string v1, ", dayCount="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.b;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = ", monthCount="; // const-string v1, ", monthCount="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.c;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "]"; // const-string v1, "]"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
