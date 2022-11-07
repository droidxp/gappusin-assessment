public class com.wiyun.engine.box2d.CDResult {
	 /* .source "CDResult.java" */
	 /* # instance fields */
	 public com.wiyun.engine.types.WYPoint normal;
	 public Integer pointCount;
	 public com.wiyun.engine.types.WYPoint points;
	 /* # direct methods */
	 public com.wiyun.engine.box2d.CDResult ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 20 */
		 /* iput v2, p0, Lcom/wiyun/engine/box2d/CDResult;->pointCount:I */
		 /* .line 29 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Lcom/wiyun/engine/types/WYPoint; */
		 /* .line 30 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* aput-object v1, v0, v2 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 31 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 /* aput-object v2, v0, v1 */
		 this.points = v0;
		 /* .line 42 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 this.normal = v0;
		 /* .line 12 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void clear ( ) {
		 /* .locals 6 */
		 /* .prologue */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 52 */
		 /* iput v2, p0, Lcom/wiyun/engine/box2d/CDResult;->pointCount:I */
		 /* .line 53 */
		 v0 = this.points;
		 /* aget-object v0, v0, v2 */
		 v1 = this.points;
		 /* aget-object v1, v1, v2 */
		 v2 = this.points;
		 /* aget-object v2, v2, v5 */
		 v3 = this.points;
		 /* aget-object v3, v3, v5 */
		 /* iput v4, v3, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iput v4, v2, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iput v4, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iput v4, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* .line 54 */
		 v0 = this.normal;
		 v1 = this.normal;
		 /* iput v4, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iput v4, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* .line 55 */
		 return;
	 } // .end method
	 public getPoints ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 69 */
		 /* iget v0, p0, Lcom/wiyun/engine/box2d/CDResult;->pointCount:I */
		 /* if-ne v0, v3, :cond_0 */
		 /* .line 70 */
		 /* new-array v0, v4, [F */
		 v1 = this.points;
		 /* aget-object v1, v1, v2 */
		 /* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* aput v1, v0, v2 */
		 v1 = this.points;
		 /* aget-object v1, v1, v2 */
		 /* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* aput v1, v0, v3 */
		 /* .line 74 */
	 } // :goto_0
	 /* .line 71 */
} // :cond_0
/* iget v0, p0, Lcom/wiyun/engine/box2d/CDResult;->pointCount:I */
/* if-ne v0, v4, :cond_1 */
/* .line 72 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [F */
v1 = this.points;
/* aget-object v1, v1, v2 */
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* aput v1, v0, v2 */
v1 = this.points;
/* aget-object v1, v1, v2 */
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* aput v1, v0, v3 */
v1 = this.points;
/* aget-object v1, v1, v3 */
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* aput v1, v0, v4 */
int v1 = 3; // const/4 v1, 0x3
v2 = this.points;
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* aput v2, v0, v1 */
/* .line 74 */
} // :cond_1
/* new-array v0, v2, [F */
} // .end method
