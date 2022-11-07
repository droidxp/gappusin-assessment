class inal extends com.doodlemobile.basket.util.d {
	 /* # instance fields */
	 private com.doodlemobile.basket.GameActivity f; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.f = p1;
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/util/d;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 6 */
		 final String v0 = "Basket"; // const-string v0, "Basket"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Logic FPS="; // const-string v2, "Logic FPS="
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v2, p0, Lcom/doodlemobile/basket/g;->b:I */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = " min:"; // const-string v2, " min:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-wide v2, p0, Lcom/doodlemobile/basket/g;->d:J */
		 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 final String v2 = " max:"; // const-string v2, " max:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-wide v2, p0, Lcom/doodlemobile/basket/g;->c:J */
		 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 final String v2 = " average:"; // const-string v2, " average:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-wide v2, p0, Lcom/doodlemobile/basket/g;->e:J */
		 /* iget v4, p0, Lcom/doodlemobile/basket/g;->a:I */
		 /* int-to-long v4, v4 */
		 /* div-long/2addr v2, v4 */
		 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.doodlemobile.basket.util.b .b ( v0,v1 );
		 return;
	 } // .end method
