public class com.wiyun.engine.types.WYDimension {
	 /* # instance fields */
	 public Integer x;
	 public Integer y;
	 /* # direct methods */
	 protected com.wiyun.engine.types.WYDimension ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0}, Lcom/wiyun/engine/types/WYDimension;-><init>(II)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.types.WYDimension ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYDimension;->x:I */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYDimension;->y:I */
		 return;
	 } // .end method
	 public static Boolean isEqual ( com.wiyun.engine.types.WYDimension p0, com.wiyun.engine.types.WYDimension p1 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYDimension;->x:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYDimension;->x:I */
		 /* if-ne v0, v1, :cond_0 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYDimension;->y:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYDimension;->y:I */
		 /* if-ne v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static com.wiyun.engine.types.WYDimension make ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYDimension; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/types/WYDimension;-><init>(II)V */
} // .end method
public static com.wiyun.engine.types.WYDimension makeArray ( Integer p0 ) {
/* .locals 3 */
/* new-array v1, p0, [Lcom/wiyun/engine/types/WYDimension; */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lt v0, p0, :cond_0 */
} // :cond_0
com.wiyun.engine.types.WYDimension .makeZero ( );
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static com.wiyun.engine.types.WYDimension makeZero ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* new-instance v0, Lcom/wiyun/engine/types/WYDimension; */
/* invoke-direct {v0, v1, v1}, Lcom/wiyun/engine/types/WYDimension;-><init>(II)V */
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "("; // const-string v1, "("
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lcom/wiyun/engine/types/WYDimension;->x:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/wiyun/engine/types/WYDimension;->y:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
