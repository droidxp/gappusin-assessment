public class org.anddev.andengine.util.Transformation {
	 /* # instance fields */
	 private Float a;
	 private Float b;
	 private Float c;
	 private Float d;
	 private Float tx;
	 private Float ty;
	 /* # direct methods */
	 public org.anddev.andengine.util.Transformation ( ) {
		 /* .locals 2 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 return;
	 } // .end method
	 private void postConcat ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 8 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iget v2, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iget v3, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iget v4, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iget v5, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 /* mul-float v6, v0, p1 */
		 /* mul-float v7, v1, p3 */
		 /* add-float/2addr v6, v7 */
		 /* iput v6, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* mul-float/2addr v0, p2 */
		 /* mul-float/2addr v1, p4 */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* mul-float v0, v2, p1 */
		 /* mul-float v1, v3, p3 */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* mul-float v0, v2, p2 */
		 /* mul-float v1, v3, p4 */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* mul-float v0, v4, p1 */
		 /* mul-float v1, v5, p3 */
		 /* add-float/2addr v0, v1 */
		 /* add-float/2addr v0, p5 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* mul-float v0, v4, p2 */
		 /* mul-float v1, v5, p4 */
		 /* add-float/2addr v0, v1 */
		 /* add-float/2addr v0, p6 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 return;
	 } // .end method
	 private void preConcat ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 8 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iget v2, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iget v3, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iget v4, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iget v5, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 /* mul-float v6, p1, v0 */
		 /* mul-float v7, p2, v2 */
		 /* add-float/2addr v6, v7 */
		 /* iput v6, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* mul-float v6, p1, v1 */
		 /* mul-float v7, p2, v3 */
		 /* add-float/2addr v6, v7 */
		 /* iput v6, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* mul-float v6, p3, v0 */
		 /* mul-float v7, p4, v2 */
		 /* add-float/2addr v6, v7 */
		 /* iput v6, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* mul-float v6, p3, v1 */
		 /* mul-float v7, p4, v3 */
		 /* add-float/2addr v6, v7 */
		 /* iput v6, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* mul-float/2addr v0, p5 */
		 /* mul-float/2addr v2, p6 */
		 /* add-float/2addr v0, v2 */
		 /* add-float/2addr v0, v4 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* mul-float v0, p5, v1 */
		 /* mul-float v1, p6, v3 */
		 /* add-float/2addr v0, v1 */
		 /* add-float/2addr v0, v5 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void postConcat ( org.anddev.andengine.util.Transformation p0 ) {
		 /* .locals 7 */
		 /* iget v1, p1, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iget v2, p1, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iget v3, p1, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iget v4, p1, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iget v5, p1, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iget v6, p1, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->postConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void postRotate ( Float p0 ) {
		 /* .locals 7 */
		 int v5 = 0; // const/4 v5, 0x0
		 v0 = 		 org.anddev.andengine.util.MathUtils .degToRad ( p1 );
		 v2 = 		 android.util.FloatMath .sin ( v0 );
		 v1 = 		 android.util.FloatMath .cos ( v0 );
		 /* neg-float v3, v2 */
		 /* move-object v0, p0 */
		 /* move v4, v1 */
		 /* move v6, v5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->postConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void postScale ( Float p0, Float p1 ) {
		 /* .locals 7 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v3, v2 */
		 /* move v4, p2 */
		 /* move v5, v2 */
		 /* move v6, v2 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->postConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void postTranslate ( Float p0, Float p1 ) {
		 /* .locals 7 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object v0, p0 */
		 /* move v3, v2 */
		 /* move v4, v1 */
		 /* move v5, p1 */
		 /* move v6, p2 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->postConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void preConcat ( org.anddev.andengine.util.Transformation p0 ) {
		 /* .locals 7 */
		 /* iget v1, p1, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iget v2, p1, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iget v3, p1, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iget v4, p1, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iget v5, p1, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iget v6, p1, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->preConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void preRotate ( Float p0 ) {
		 /* .locals 7 */
		 int v5 = 0; // const/4 v5, 0x0
		 v0 = 		 org.anddev.andengine.util.MathUtils .degToRad ( p1 );
		 v2 = 		 android.util.FloatMath .sin ( v0 );
		 v1 = 		 android.util.FloatMath .cos ( v0 );
		 /* neg-float v3, v2 */
		 /* move-object v0, p0 */
		 /* move v4, v1 */
		 /* move v6, v5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->preConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void preScale ( Float p0, Float p1 ) {
		 /* .locals 7 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v3, v2 */
		 /* move v4, p2 */
		 /* move v5, v2 */
		 /* move v6, v2 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->preConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void preTranslate ( Float p0, Float p1 ) {
		 /* .locals 7 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object v0, p0 */
		 /* move v3, v2 */
		 /* move v4, v1 */
		 /* move v5, p1 */
		 /* move v6, p2 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/util/Transformation;->preConcat(FFFFFF)V */
		 return;
	 } // .end method
	 public void reset ( ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.util.Transformation ) p0 ).setToIdentity ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/Transformation;->setToIdentity()V
		 return;
	 } // .end method
	 public void setTo ( org.anddev.andengine.util.Transformation p0 ) {
		 /* .locals 1 */
		 /* iget v0, p1, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 return;
	 } // .end method
	 public void setToIdentity ( ) {
		 /* .locals 2 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.Transformation setToRotate ( Float p0 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = 		 org.anddev.andengine.util.MathUtils .degToRad ( p1 );
		 v1 = 		 android.util.FloatMath .sin ( v0 );
		 v0 = 		 android.util.FloatMath .cos ( v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* neg-float v1, v1 */
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iput v2, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iput v2, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
	 } // .end method
	 public org.anddev.andengine.util.Transformation setToScale ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput p1, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iput p2, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
	 } // .end method
	 public org.anddev.andengine.util.Transformation setToTranslate ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 /* iput v1, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 /* iput p1, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 /* iput p2, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "Transformation{["; // const-string v1, "Transformation{["
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = "]["; // const-string v1, "]["
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = "][0.0, 0.0, 1.0]}"; // const-string v1, "][0.0, 0.0, 1.0]}"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public void transform ( Float[] p0 ) {
		 /* .locals 8 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* array-length v0, p1 */
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* move v2, v0 */
		 /* move v0, v1 */
	 } // :goto_0
	 /* add-int/lit8 v2, v2, -0x1 */
	 /* if-gez v2, :cond_0 */
	 return;
} // :cond_0
/* add-int/lit8 v3, v1, 0x1 */
/* aget v1, p1, v1 */
/* add-int/lit8 v4, v3, 0x1 */
/* aget v3, p1, v3 */
/* add-int/lit8 v5, v0, 0x1 */
/* iget v6, p0, Lorg/anddev/andengine/util/Transformation;->a:F */
/* mul-float/2addr v6, v1 */
/* iget v7, p0, Lorg/anddev/andengine/util/Transformation;->c:F */
/* mul-float/2addr v7, v3 */
/* add-float/2addr v6, v7 */
/* iget v7, p0, Lorg/anddev/andengine/util/Transformation;->tx:F */
/* add-float/2addr v6, v7 */
/* aput v6, p1, v0 */
/* add-int/lit8 v0, v5, 0x1 */
/* iget v6, p0, Lorg/anddev/andengine/util/Transformation;->b:F */
/* mul-float/2addr v1, v6 */
/* iget v6, p0, Lorg/anddev/andengine/util/Transformation;->d:F */
/* mul-float/2addr v3, v6 */
/* add-float/2addr v1, v3 */
/* iget v3, p0, Lorg/anddev/andengine/util/Transformation;->ty:F */
/* add-float/2addr v1, v3 */
/* aput v1, p1, v5 */
/* move v1, v4 */
} // .end method
