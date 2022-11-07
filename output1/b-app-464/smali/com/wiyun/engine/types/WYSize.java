public class com.wiyun.engine.types.WYSize {
	 /* # instance fields */
	 public Float height;
	 public Float width;
	 /* # direct methods */
	 private com.wiyun.engine.types.WYSize ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0}, Lcom/wiyun/engine/types/WYSize;-><init>(FF)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.types.WYSize ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 return;
	 } // .end method
	 public static Boolean isEqual ( com.wiyun.engine.types.WYSize p0, com.wiyun.engine.types.WYSize p1 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYSize;->height:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static com.wiyun.engine.types.WYSize make ( Float p0, Float p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/types/WYSize;-><init>(FF)V */
} // .end method
public static com.wiyun.engine.types.WYSize makeZero ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* new-instance v0, Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {v0, v1, v1}, Lcom/wiyun/engine/types/WYSize;-><init>(FF)V */
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "<"; // const-string v1, "<"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lcom/wiyun/engine/types/WYSize;->width:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/wiyun/engine/types/WYSize;->height:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ">"; // const-string v1, ">"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
