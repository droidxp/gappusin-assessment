public class com.wiyun.engine.types.WYDimension {
	 /* .source "WYDimension.java" */
	 /* # instance fields */
	 public Integer x;
	 public Integer y;
	 /* # direct methods */
	 protected com.wiyun.engine.types.WYDimension ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 33 */
		 /* invoke-direct {p0, v0, v0}, Lcom/wiyun/engine/types/WYDimension;-><init>(II)V */
		 /* .line 34 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.types.WYDimension ( ) {
		 /* .locals 0 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 37 */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYDimension;->x:I */
		 /* .line 38 */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYDimension;->y:I */
		 /* .line 39 */
		 return;
	 } // .end method
	 public static Boolean isEqual ( com.wiyun.engine.types.WYDimension p0, com.wiyun.engine.types.WYDimension p1 ) {
		 /* .locals 2 */
		 /* .param p0, "p1" # Lcom/wiyun/engine/types/WYDimension; */
		 /* .param p1, "p2" # Lcom/wiyun/engine/types/WYDimension; */
		 /* .prologue */
		 /* .line 47 */
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
/* .param p0, "x" # I */
/* .param p1, "y" # I */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/types/WYDimension; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/types/WYDimension;-><init>(II)V */
} // .end method
public static com.wiyun.engine.types.WYDimension makeArray ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "size" # I */
/* .prologue */
/* .line 26 */
/* new-array v1, p0, [Lcom/wiyun/engine/types/WYDimension; */
/* .line 27 */
/* .local v1, "p":[Lcom/wiyun/engine/types/WYDimension; */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, p0, :cond_0 */
/* .line 29 */
/* .line 28 */
} // :cond_0
com.wiyun.engine.types.WYDimension .makeZero ( );
/* aput-object v2, v1, v0 */
/* .line 27 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static com.wiyun.engine.types.WYDimension makeZero ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/types/WYDimension; */
/* invoke-direct {v0, v1, v1}, Lcom/wiyun/engine/types/WYDimension;-><init>(II)V */
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 43 */
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
