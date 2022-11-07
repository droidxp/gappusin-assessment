public class com.wiyun.engine.chipmunk.Space {
	 /* .source "Space.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/chipmunk/Space$IBodyVisitor;, */
	 /* Lcom/wiyun/engine/chipmunk/Space$IPointQueryCallback;, */
	 /* Lcom/wiyun/engine/chipmunk/Space$IPostStepCallback;, */
	 /* Lcom/wiyun/engine/chipmunk/Space$ISegmentQueryCallback;, */
	 /* Lcom/wiyun/engine/chipmunk/Space$SegmentQueryInfo; */
	 /* } */
} // .end annotation
/* # instance fields */
Integer mPointer;
/* # direct methods */
protected com.wiyun.engine.chipmunk.Space ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 92 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 93 */
	 /* iput p1, p0, Lcom/wiyun/engine/chipmunk/Space;->mPointer:I */
	 /* .line 94 */
	 return;
} // .end method
private native void cleanShapesOfBody ( com.wiyun.engine.chipmunk.Body p0 ) {
} // .end method
public static com.wiyun.engine.chipmunk.Space from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 89 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Space; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/Space;-><init>(I)V */
} // .end method
private native Integer getShapeOfBody ( Integer p0 ) {
} // .end method
private native Integer nativeGetAnyShape ( com.wiyun.engine.chipmunk.Body p0 ) {
} // .end method
private native void nativeGetBodies ( Integer[] p0 ) {
} // .end method
private native Integer nativeQueryPointFirst ( Float p0, Float p1, Integer p2, Integer p3 ) {
} // .end method
private native Integer prepareShapesOfBody ( com.wiyun.engine.chipmunk.Body p0 ) {
} // .end method
/* # virtual methods */
public native void addBody ( com.wiyun.engine.chipmunk.Body p0 ) {
} // .end method
public native void addCollisionHandler ( Integer p0, Integer p1, com.wiyun.engine.chipmunk.ICollisionHandler p2, java.lang.Object p3 ) {
} // .end method
public native void addConstraint ( com.wiyun.engine.chipmunk.Constraint p0 ) {
} // .end method
public native void addPostStepCallback ( com.wiyun.engine.chipmunk.Space$IPostStepCallback p0, java.lang.Object p1, java.lang.Object p2 ) {
} // .end method
public native void addShape ( com.wiyun.engine.chipmunk.Shape p0 ) {
} // .end method
public native void addStaticShape ( com.wiyun.engine.chipmunk.Shape p0 ) {
} // .end method
public native void destroy ( ) {
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "o" # Ljava/lang/Object; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 102 */
/* instance-of v1, p1, Lcom/wiyun/engine/chipmunk/Space; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 103 */
/* check-cast p1, Lcom/wiyun/engine/chipmunk/Space; */
} // .end local p1 # "o":Ljava/lang/Object;
/* iget v1, p1, Lcom/wiyun/engine/chipmunk/Space;->mPointer:I */
/* iget v2, p0, Lcom/wiyun/engine/chipmunk/Space;->mPointer:I */
/* if-ne v1, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 105 */
} // :cond_0
} // .end method
public com.wiyun.engine.chipmunk.Shape getAnyShapeOfBody ( com.wiyun.engine.chipmunk.Body p0 ) {
/* .locals 1 */
/* .param p1, "body" # Lcom/wiyun/engine/chipmunk/Body; */
/* .prologue */
/* .line 218 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Space;->nativeGetAnyShape(Lcom/wiyun/engine/chipmunk/Body;)I */
com.wiyun.engine.chipmunk.Shape .from ( v0 );
} // .end method
public java.util.List getBodies ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/wiyun/engine/chipmunk/Body;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 119 */
v3 = (( com.wiyun.engine.chipmunk.Space ) p0 ).getBodyCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Space;->getBodyCount()I
/* new-array v2, v3, [I */
/* .line 120 */
/* .local v2, "pointers":[I */
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/chipmunk/Space;->nativeGetBodies([I)V */
/* .line 121 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 122 */
/* .local v0, "bodies":Ljava/util/List;, "Ljava/util/List<Lcom/wiyun/engine/chipmunk/Body;>;" */
/* array-length v4, v2 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-lt v3, v4, :cond_0 */
/* .line 125 */
/* .line 122 */
} // :cond_0
/* aget v1, v2, v3 */
/* .line 123 */
/* .local v1, "p":I */
com.wiyun.engine.chipmunk.Body .from ( v1 );
/* .line 122 */
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
public native Integer getBodyCount ( ) {
} // .end method
public native Float getDamping ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getGravity ( ) {
/* .locals 2 */
/* .prologue */
/* .line 360 */
v0 = (( com.wiyun.engine.chipmunk.Space ) p0 ).getGravityX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Space;->getGravityX()F
v1 = (( com.wiyun.engine.chipmunk.Space ) p0 ).getGravityY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Space;->getGravityY()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getGravityX ( ) {
} // .end method
public native Float getGravityY ( ) {
} // .end method
public java.util.ArrayList getShapesOfBody ( com.wiyun.engine.chipmunk.Body p0 ) {
/* .locals 5 */
/* .param p1, "body" # Lcom/wiyun/engine/chipmunk/Body; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/wiyun/engine/chipmunk/Body;", */
/* ")", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/wiyun/engine/chipmunk/Shape;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 228 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
/* .line 229 */
/* .local v3, "shapes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/wiyun/engine/chipmunk/Shape;>;" */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Space;->prepareShapesOfBody(Lcom/wiyun/engine/chipmunk/Body;)I */
/* .line 230 */
/* .local v0, "count":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v0, :cond_0 */
/* .line 234 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Space;->cleanShapesOfBody(Lcom/wiyun/engine/chipmunk/Body;)V */
/* .line 235 */
/* .line 231 */
} // :cond_0
v2 = /* invoke-direct {p0, v1}, Lcom/wiyun/engine/chipmunk/Space;->getShapeOfBody(I)I */
/* .line 232 */
/* .local v2, "pointer":I */
com.wiyun.engine.chipmunk.Shape .from ( v2 );
(( java.util.ArrayList ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 230 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public native Integer getStamp ( ) {
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 110 */
/* iget v0, p0, Lcom/wiyun/engine/chipmunk/Space;->mPointer:I */
} // .end method
public native Boolean isLocked ( ) {
} // .end method
public native void queryPoint ( Float p0, Float p1, Integer p2, Integer p3, com.wiyun.engine.chipmunk.Space$IPointQueryCallback p4, java.lang.Object p5 ) {
} // .end method
public void queryPoint ( com.wiyun.engine.types.WYPoint p0, Integer p1, Integer p2, com.wiyun.engine.chipmunk.Space$IPointQueryCallback p3, java.lang.Object p4 ) {
/* .locals 7 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "layer" # I */
/* .param p3, "group" # I */
/* .param p4, "callback" # Lcom/wiyun/engine/chipmunk/Space$IPointQueryCallback; */
/* .param p5, "data" # Ljava/lang/Object; */
/* .prologue */
/* .line 472 */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v0, p0 */
/* move v3, p2 */
/* move v4, p3 */
/* move-object v5, p4 */
/* move-object v6, p5 */
/* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/chipmunk/Space;->queryPoint(FFIILcom/wiyun/engine/chipmunk/Space$IPointQueryCallback;Ljava/lang/Object;)V */
/* .line 473 */
return;
} // .end method
public com.wiyun.engine.chipmunk.Shape queryPointFirst ( Float p0, Float p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .param p3, "layer" # I */
/* .param p4, "group" # I */
/* .prologue */
/* .line 455 */
v0 = /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/chipmunk/Space;->nativeQueryPointFirst(FFII)I */
/* .line 456 */
/* .local v0, "pointer":I */
/* if-nez v0, :cond_0 */
/* .line 457 */
int v1 = 0; // const/4 v1, 0x0
/* .line 459 */
} // :goto_0
} // :cond_0
com.wiyun.engine.chipmunk.Shape .from ( v0 );
} // .end method
public com.wiyun.engine.chipmunk.Shape queryPointFirst ( com.wiyun.engine.types.WYPoint p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "layer" # I */
/* .param p3, "group" # I */
/* .prologue */
/* .line 442 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.Space ) p0 ).queryPointFirst ( v0, v1, p2, p3 ); // invoke-virtual {p0, v0, v1, p2, p3}, Lcom/wiyun/engine/chipmunk/Space;->queryPointFirst(FFII)Lcom/wiyun/engine/chipmunk/Shape;
} // .end method
public native void querySegment ( Float p0, Float p1, Float p2, Float p3, Integer p4, Integer p5, com.wiyun.engine.chipmunk.Space$ISegmentQueryCallback p6, java.lang.Object p7 ) {
} // .end method
public void querySegment ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Integer p2, Integer p3, com.wiyun.engine.chipmunk.Space$ISegmentQueryCallback p4, java.lang.Object p5 ) {
/* .locals 9 */
/* .param p1, "start" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "end" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "layer" # I */
/* .param p4, "group" # I */
/* .param p5, "callback" # Lcom/wiyun/engine/chipmunk/Space$ISegmentQueryCallback; */
/* .param p6, "data" # Ljava/lang/Object; */
/* .prologue */
/* .line 498 */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v4, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v0, p0 */
/* move v5, p3 */
/* move v6, p4 */
/* move-object v7, p5 */
/* move-object v8, p6 */
/* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/chipmunk/Space;->querySegment(FFFFIILcom/wiyun/engine/chipmunk/Space$ISegmentQueryCallback;Ljava/lang/Object;)V */
/* .line 499 */
return;
} // .end method
public native void querySegmentFirst ( Float p0, Float p1, Float p2, Float p3, Integer p4, Integer p5, com.wiyun.engine.chipmunk.Space$SegmentQueryInfo p6 ) {
} // .end method
public void querySegmentFirst ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Integer p2, Integer p3, com.wiyun.engine.chipmunk.Space$SegmentQueryInfo p4 ) {
/* .locals 8 */
/* .param p1, "start" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "end" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "layer" # I */
/* .param p4, "group" # I */
/* .param p5, "info" # Lcom/wiyun/engine/chipmunk/Space$SegmentQueryInfo; */
/* .prologue */
/* .line 373 */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v4, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v0, p0 */
/* move v5, p3 */
/* move v6, p4 */
/* move-object v7, p5 */
/* invoke-virtual/range {v0 ..v7}, Lcom/wiyun/engine/chipmunk/Space;->querySegmentFirst(FFFFIILcom/wiyun/engine/chipmunk/Space$SegmentQueryInfo;)V */
/* .line 374 */
return;
} // .end method
public native void rehashStatic ( ) {
} // .end method
public native void removeAndDestroyBody ( com.wiyun.engine.chipmunk.Body p0 ) {
} // .end method
public void removeAndDestroyShape ( com.wiyun.engine.chipmunk.Shape p0 ) {
/* .locals 0 */
/* .param p1, "shape" # Lcom/wiyun/engine/chipmunk/Shape; */
/* .prologue */
/* .line 177 */
(( com.wiyun.engine.chipmunk.Space ) p0 ).removeShape ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/chipmunk/Space;->removeShape(Lcom/wiyun/engine/chipmunk/Shape;)V
/* .line 178 */
(( com.wiyun.engine.chipmunk.Shape ) p1 ).destroy ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/chipmunk/Shape;->destroy()V
/* .line 179 */
return;
} // .end method
public native void removeAndDestroyShapesOfBody ( com.wiyun.engine.chipmunk.Body p0 ) {
} // .end method
public native void removeBody ( com.wiyun.engine.chipmunk.Body p0 ) {
} // .end method
public native void removeCollisionHandler ( Integer p0, Integer p1 ) {
} // .end method
public native void removeConstraint ( com.wiyun.engine.chipmunk.Constraint p0 ) {
} // .end method
public native void removeShape ( com.wiyun.engine.chipmunk.Shape p0 ) {
} // .end method
public native void removeStaticShape ( com.wiyun.engine.chipmunk.Shape p0 ) {
} // .end method
public native void resizeActiveHash ( Float p0, Integer p1 ) {
} // .end method
public native void resizeStaticHash ( Float p0, Integer p1 ) {
} // .end method
protected native void scheduleRemoveAndDestroyShapeAndBody ( com.wiyun.engine.chipmunk.Shape p0 ) {
} // .end method
public native void setDamping ( Float p0 ) {
} // .end method
public native void setElasticIterations ( Integer p0 ) {
} // .end method
public native void setGravity ( Float p0, Float p1 ) {
} // .end method
public native void setIterations ( Integer p0 ) {
} // .end method
public void setPointer ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "pointer" # I */
/* .prologue */
/* .line 97 */
/* iput p1, p0, Lcom/wiyun/engine/chipmunk/Space;->mPointer:I */
/* .line 98 */
return;
} // .end method
public native void step ( Float p0 ) {
} // .end method
public native void visitBody ( com.wiyun.engine.chipmunk.Space$IBodyVisitor p0, java.lang.Object p1 ) {
} // .end method
