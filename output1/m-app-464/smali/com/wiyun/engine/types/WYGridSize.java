public class com.wiyun.engine.types.WYGridSize {
	 /* # instance fields */
	 public Integer x;
	 public Integer y;
	 /* # direct methods */
	 protected com.wiyun.engine.types.WYGridSize ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYGridSize make ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYGridSize; */
		 /* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/types/WYGridSize;-><init>(II)V */
	 } // .end method
	 public static com.wiyun.engine.types.WYGridSize makeZero ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-instance v0, Lcom/wiyun/engine/types/WYGridSize; */
		 /* invoke-direct {v0, v1, v1}, Lcom/wiyun/engine/types/WYGridSize;-><init>(II)V */
	 } // .end method
	 /* # virtual methods */
	 public void reuse ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "<"; // const-string v1, "<"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ">"; // const-string v1, ">"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
