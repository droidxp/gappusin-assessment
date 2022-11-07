public class com.wiyun.engine.types.WYColor3B {
	 /* .source "WYColor3B.java" */
	 /* # instance fields */
	 public Integer b;
	 public Integer g;
	 public Integer r;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYColor3B ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* const/16 v0, 0xff */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 13 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* .line 14 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* .line 15 */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* .line 16 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor3B ( ) {
		 /* .locals 0 */
		 /* .param p1, "rr" # I */
		 /* .param p2, "gg" # I */
		 /* .param p3, "bb" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 19 */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* .line 20 */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* .line 21 */
		 /* iput p3, p0, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* .line 22 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYColor3B make ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .param p0, "r" # I */
		 /* .param p1, "g" # I */
		 /* .param p2, "b" # I */
		 /* .prologue */
		 /* .line 9 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
	 } // .end method
	 /* # virtual methods */
	 public glFormat ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 25 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [B */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 26 */
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* int-to-byte v2, v2 */
		 /* aput-byte v2, v0, v1 */
		 /* .line 25 */
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F toColor4F ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* const/high16 v4, 0x437f0000 # 255.0f */
		 /* .line 31 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor4F; */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v1, v4 */
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* int-to-float v2, v2 */
		 /* div-float/2addr v2, v4 */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* int-to-float v3, v3 */
		 /* div-float/2addr v3, v4 */
		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 /* invoke-direct {v0, v1, v2, v3, v4}, Lcom/wiyun/engine/types/WYColor4F;-><init>(FFFF)V */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 36 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "< r="; // const-string v1, "< r="
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", g="; // const-string v1, ", g="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", b="; // const-string v1, ", b="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " >"; // const-string v1, " >"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
