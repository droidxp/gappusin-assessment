public class com.wiyun.engine.types.WYColor4F {
	 /* # instance fields */
	 public Float a;
	 public Float b;
	 public Float g;
	 public Float r;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iput p3, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iput p4, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->r:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->g:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->b:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->a:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYColor4F make ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor4F; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYColor4F;-><init>(FFFF)V */
	 } // .end method
	 /* # virtual methods */
	 public glFormat ( ) {
		 /* .locals 3 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* aput v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* aput v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* aput v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* aput v2, v0, v1 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "< r="; // const-string v1, "< r="
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", g="; // const-string v1, ", g="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", b="; // const-string v1, ", b="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", a="; // const-string v1, ", a="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = " >"; // const-string v1, " >"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
