public class com.wiyun.engine.types.WYPointList {
	 /* .source "WYPointList.java" */
	 /* # instance fields */
	 private java.util.List mPoints;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lcom/wiyun/engine/types/WYPoint;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.wiyun.engine.types.WYPointList ( ) {
/* .locals 1 */
/* .prologue */
/* .line 9 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 10 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mPoints = v0;
/* .line 11 */
return;
} // .end method
/* # virtual methods */
public void addPoint ( Float p0, Float p1 ) {
/* .locals 2 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 14 */
v0 = this.mPoints;
com.wiyun.engine.types.WYPoint .make ( p1,p2 );
/* .line 15 */
return;
} // .end method
public void addPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 1 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 18 */
v0 = this.mPoints;
/* .line 19 */
return;
} // .end method
public void addPoints ( com.wiyun.engine.types.WYPointList p0 ) {
/* .locals 2 */
/* .param p1, "plist" # Lcom/wiyun/engine/types/WYPointList; */
/* .prologue */
/* .line 22 */
v0 = this.mPoints;
(( com.wiyun.engine.types.WYPointList ) p1 ).getPoints ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYPointList;->getPoints()Ljava/util/List;
/* .line 23 */
return;
} // .end method
public void clear ( ) {
/* .locals 1 */
/* .prologue */
/* .line 26 */
v0 = this.mPoints;
/* .line 27 */
return;
} // .end method
public void deletePointAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 34 */
/* if-ltz p1, :cond_0 */
v0 = v0 = this.mPoints;
/* if-lt p1, v0, :cond_1 */
/* .line 38 */
} // :cond_0
} // :goto_0
return;
/* .line 37 */
} // :cond_1
v0 = this.mPoints;
} // .end method
public Integer getCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 30 */
v0 = v0 = this.mPoints;
} // .end method
public com.wiyun.engine.types.WYPoint getPointAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 45 */
/* if-ltz p1, :cond_0 */
v0 = v0 = this.mPoints;
/* if-lt p1, v0, :cond_1 */
/* .line 46 */
} // :cond_0
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 48 */
} // :goto_0
} // :cond_1
v0 = this.mPoints;
/* check-cast v0, Lcom/wiyun/engine/types/WYPoint; */
} // .end method
public java.util.List getPoints ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/wiyun/engine/types/WYPoint;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 41 */
v0 = this.mPoints;
} // .end method
