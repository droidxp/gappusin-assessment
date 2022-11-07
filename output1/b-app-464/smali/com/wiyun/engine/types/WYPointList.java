public class com.wiyun.engine.types.WYPointList {
	 /* # instance fields */
	 private java.util.List mPoints;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYPointList ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mPoints = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addPoint ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 v0 = this.mPoints;
		 com.wiyun.engine.types.WYPoint .make ( p1,p2 );
		 return;
	 } // .end method
	 public void addPoint ( com.wiyun.engine.types.WYPoint p0 ) {
		 /* .locals 1 */
		 v0 = this.mPoints;
		 return;
	 } // .end method
	 public void addPoints ( com.wiyun.engine.types.WYPointList p0 ) {
		 /* .locals 2 */
		 v0 = this.mPoints;
		 (( com.wiyun.engine.types.WYPointList ) p1 ).getPoints ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYPointList;->getPoints()Ljava/util/List;
		 return;
	 } // .end method
	 public void clear ( ) {
		 /* .locals 1 */
		 v0 = this.mPoints;
		 return;
	 } // .end method
	 public void deletePointAt ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-ltz p1, :cond_0 */
		 v0 = 		 v0 = this.mPoints;
		 /* if-lt p1, v0, :cond_1 */
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.mPoints;
} // .end method
public Integer getCount ( ) {
/* .locals 1 */
v0 = v0 = this.mPoints;
} // .end method
public com.wiyun.engine.types.WYPoint getPointAt ( Integer p0 ) {
/* .locals 1 */
/* if-ltz p1, :cond_0 */
v0 = v0 = this.mPoints;
/* if-lt p1, v0, :cond_1 */
} // :cond_0
com.wiyun.engine.types.WYPoint .makeZero ( );
} // :goto_0
} // :cond_1
v0 = this.mPoints;
/* check-cast v0, Lcom/wiyun/engine/types/WYPoint; */
} // .end method
public java.util.List getPoints ( ) {
/* .locals 1 */
v0 = this.mPoints;
} // .end method
