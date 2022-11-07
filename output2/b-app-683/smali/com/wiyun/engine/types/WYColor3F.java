public class com.wiyun.engine.types.WYColor3F {
	 /* .source "WYColor3F.java" */
	 /* # instance fields */
	 public Float b;
	 public Float g;
	 public Float r;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYColor3F ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 13 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* .line 14 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor3F ( ) {
		 /* .locals 0 */
		 /* .param p1, "rr" # F */
		 /* .param p2, "gg" # F */
		 /* .param p3, "bb" # F */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* .line 18 */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* .line 19 */
		 /* iput p3, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* .line 20 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor3F ( ) {
		 /* .locals 1 */
		 /* .param p1, "c" # Lcom/wiyun/engine/types/WYColor3B; */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 41 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* .line 42 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* .line 43 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* .line 44 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor3F ( ) {
		 /* .locals 1 */
		 /* .param p1, "c" # Lcom/wiyun/engine/types/WYColor3F; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 23 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* .line 24 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* .line 25 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* .line 26 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor3F ( ) {
		 /* .locals 1 */
		 /* .param p1, "c" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 35 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->r:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* .line 36 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->g:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* .line 37 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->b:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* .line 38 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor3F ( ) {
		 /* .locals 1 */
		 /* .param p1, "c" # Lcom/wiyun/engine/types/WYColor4F; */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 29 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* .line 30 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* .line 31 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* .line 32 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYColor3F make ( Float p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 /* .param p0, "r" # F */
		 /* .param p1, "g" # F */
		 /* .param p2, "b" # F */
		 /* .prologue */
		 /* .line 9 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3F; */
		 /* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/types/WYColor3F;-><init>(FFF)V */
	 } // .end method
	 /* # virtual methods */
	 public glFormat ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 47 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 48 */
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 /* aput v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 /* aput v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 /* aput v2, v0, v1 */
		 /* .line 47 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 54 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "< r="; // const-string v1, "< r="
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor3F;->r:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", g="; // const-string v1, ", g="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor3F;->g:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", b="; // const-string v1, ", b="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor3F;->b:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
