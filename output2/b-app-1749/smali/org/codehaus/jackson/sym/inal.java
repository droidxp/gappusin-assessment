public class inal extends org.codehaus.jackson.sym.Name {
	 /* .source "Name3.java" */
	 /* # instance fields */
	 final Integer mQuad1;
	 final Integer mQuad2;
	 final Integer mQuad3;
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "hash" # I */
		 /* .param p3, "q1" # I */
		 /* .param p4, "q2" # I */
		 /* .param p5, "q3" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1, p2}, Lorg/codehaus/jackson/sym/Name;-><init>(Ljava/lang/String;I)V */
		 /* .line 18 */
		 /* iput p3, p0, Lorg/codehaus/jackson/sym/Name3;->mQuad1:I */
		 /* .line 19 */
		 /* iput p4, p0, Lorg/codehaus/jackson/sym/Name3;->mQuad2:I */
		 /* .line 20 */
		 /* iput p5, p0, Lorg/codehaus/jackson/sym/Name3;->mQuad3:I */
		 /* .line 21 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p1, "quad" # I */
		 /* .prologue */
		 /* .line 24 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean equals ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p1, "quad1" # I */
		 /* .param p2, "quad2" # I */
		 /* .prologue */
		 /* .line 27 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean equals ( Integer[] p0, Integer p1 ) {
		 /* .locals 4 */
		 /* .param p1, "quads" # [I */
		 /* .param p2, "qlen" # I */
		 /* .prologue */
		 int v0 = 1; // const/4 v0, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 31 */
		 int v2 = 3; // const/4 v2, 0x3
		 /* if-ne p2, v2, :cond_0 */
		 /* aget v2, p1, v1 */
		 /* iget v3, p0, Lorg/codehaus/jackson/sym/Name3;->mQuad1:I */
		 /* if-ne v2, v3, :cond_0 */
		 /* aget v2, p1, v0 */
		 /* iget v3, p0, Lorg/codehaus/jackson/sym/Name3;->mQuad2:I */
		 /* if-ne v2, v3, :cond_0 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* aget v2, p1, v2 */
		 /* iget v3, p0, Lorg/codehaus/jackson/sym/Name3;->mQuad3:I */
		 /* if-ne v2, v3, :cond_0 */
	 } // :goto_0
} // :cond_0
/* move v0, v1 */
} // .end method
