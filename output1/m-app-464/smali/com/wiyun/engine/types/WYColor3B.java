public class com.wiyun.engine.types.WYColor3B {
	 /* # instance fields */
	 public Integer b;
	 public Integer g;
	 public Integer r;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYColor3B ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0xff */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYColor3B ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* iput p3, p0, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYColor3B make ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
	 } // .end method
	 /* # virtual methods */
	 public glFormat ( ) {
		 /* .locals 3 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [B */
		 int v1 = 0; // const/4 v1, 0x0
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
	 } // .end method
	 public com.wiyun.engine.types.WYColor4F toColor4F ( ) {
		 /* .locals 5 */
		 /* const/high16 v4, 0x437f0000 # 255.0f */
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
