public class com.wiyun.engine.types.WYColor4F {
	 /* .source "WYColor4F.java" */
	 /* # instance fields */
	 public Float a;
	 public Float b;
	 public Float g;
	 public Float r;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* .line 15 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 0 */
		 /* .param p1, "rr" # F */
		 /* .param p2, "gg" # F */
		 /* .param p3, "bb" # F */
		 /* .param p4, "aa" # F */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* .line 19 */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* .line 20 */
		 /* iput p3, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* .line 21 */
		 /* iput p4, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* .line 22 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* .param p1, "c" # Lcom/wiyun/engine/types/WYColor3B; */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 39 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* .line 40 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* .line 41 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* .line 42 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* .line 43 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* .param p1, "c" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 32 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->r:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* .line 33 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->g:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* .line 34 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->b:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* .line 35 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4B;->a:I */
		 /* div-int/lit16 v0, v0, 0xff */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* .line 36 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F ( ) {
		 /* .locals 1 */
		 /* .param p1, "c" # Lcom/wiyun/engine/types/WYColor4F; */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 25 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->r:F */
		 /* .line 26 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->g:F */
		 /* .line 27 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->b:F */
		 /* .line 28 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor4F;->a:F */
		 /* .line 29 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYColor4F make ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 1 */
		 /* .param p0, "r" # F */
		 /* .param p1, "g" # F */
		 /* .param p2, "b" # F */
		 /* .param p3, "a" # F */
		 /* .prologue */
		 /* .line 10 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor4F; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYColor4F;-><init>(FFFF)V */
	 } // .end method
	 /* # virtual methods */
	 public glFormat ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 46 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 47 */
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
		 /* .line 46 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 53 */
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
