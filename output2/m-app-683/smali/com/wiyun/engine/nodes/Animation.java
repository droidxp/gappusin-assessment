public class com.wiyun.engine.nodes.Animation extends com.wiyun.engine.BaseWYObject {
	 /* .source "Animation.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/Animation$IAnimationCallback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.nodes.Animation ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 58 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
	 /* .line 59 */
	 return;
} // .end method
public com.wiyun.engine.nodes.Animation ( ) {
	 /* .locals 2 */
	 /* .param p1, "id" # I */
	 /* .prologue */
	 /* .line 71 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 0; // const/4 v1, 0x0
	 /* new-array v1, v1, [I */
	 /* invoke-direct {p0, p1, v0, v1}, Lcom/wiyun/engine/nodes/Animation;-><init>(IF[I)V */
	 /* .line 72 */
	 return;
} // .end method
public com.wiyun.engine.nodes.Animation ( ) {
	 /* .locals 3 */
	 /* .param p1, "id" # I */
	 /* .param p2, "frameDuration" # F */
	 /* .param p3, "resIds" # [I */
	 /* .prologue */
	 /* .line 82 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
	 /* .line 83 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Animation;->nativeInit(I)V */
	 /* .line 85 */
	 if ( p3 != null) { // if-eqz p3, :cond_0
		 /* .line 86 */
		 /* array-length v2, p3 */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-lt v1, v2, :cond_1 */
	 /* .line 90 */
} // :cond_0
return;
/* .line 86 */
} // :cond_1
/* aget v0, p3, v1 */
/* .line 87 */
/* .local v0, "resId":I */
(( com.wiyun.engine.nodes.Animation ) p0 ).addFrame ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/wiyun/engine/nodes/Animation;->addFrame(FI)V
/* .line 86 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public com.wiyun.engine.nodes.Animation ( ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .param p2, "frameDuration" # F */
/* .param p3, "textures" # [Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 99 */
/* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
/* .line 100 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Animation;->nativeInit(I)V */
/* .line 102 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 103 */
/* array-length v2, p3 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v2, :cond_1 */
/* .line 107 */
} // :cond_0
return;
/* .line 103 */
} // :cond_1
/* aget-object v0, p3, v1 */
/* .line 104 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
(( com.wiyun.engine.nodes.Animation ) p0 ).addFrame ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/wiyun/engine/nodes/Animation;->addFrame(FLcom/wiyun/engine/opengl/Texture2D;)V
/* .line 103 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
protected com.wiyun.engine.nodes.Animation ( ) {
/* .locals 0 */
/* .param p1, "dummy" # I */
/* .param p2, "pointer" # I */
/* .prologue */
/* .line 62 */
/* invoke-direct {p0, p2}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
/* .line 63 */
return;
} // .end method
public static com.wiyun.engine.nodes.Animation from ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "pointer" # I */
/* .prologue */
/* .line 55 */
/* if-nez p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Animation; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, p0}, Lcom/wiyun/engine/nodes/Animation;-><init>(II)V */
} // .end method
private native Integer getFrameCount ( ) {
} // .end method
private native void nativeGetFrames ( Integer[] p0 ) {
} // .end method
private native void nativeInit ( Integer p0 ) {
} // .end method
/* # virtual methods */
public void addFrame ( Float p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "frameDuration" # F */
/* .param p2, "resId" # I */
/* .prologue */
/* .line 121 */
com.wiyun.engine.opengl.Texture2D .makePNG ( p2 );
(( com.wiyun.engine.opengl.Texture2D ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/Texture2D;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* .line 122 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
(( com.wiyun.engine.nodes.Animation ) p0 ).addFrame ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Animation;->addFrame(FLcom/wiyun/engine/opengl/Texture2D;)V
/* .line 123 */
return;
} // .end method
public native void addFrame ( Float p0, com.wiyun.engine.opengl.Texture2D p1 ) {
} // .end method
public native void addFrame ( Float p0, com.wiyun.engine.types.WYRect p1 ) {
} // .end method
public void addFrame ( Float p0, com.wiyun.engine.types.WYRect...p1 ) {
/* .locals 3 */
/* .param p1, "duration" # F */
/* .param p2, "rects" # [Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 132 */
/* array-length v2, p2 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v2, :cond_0 */
/* .line 135 */
return;
/* .line 132 */
} // :cond_0
/* aget-object v0, p2, v1 */
/* .line 133 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
(( com.wiyun.engine.nodes.Animation ) p0 ).addFrame ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/Animation;->addFrame(FLcom/wiyun/engine/types/WYRect;)V
/* .line 132 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public native void addFrame ( com.wiyun.engine.nodes.Frame p0 ) {
} // .end method
public native Float getDuration ( ) {
} // .end method
public java.util.List getFrames ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<+", */
/* "Lcom/wiyun/engine/nodes/Frame;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 37 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 38 */
/* .local v1, "frames":Ljava/util/List;, "Ljava/util/List<Lcom/wiyun/engine/nodes/Frame;>;" */
v4 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Animation;->getFrameCount()I */
/* .line 39 */
/* .local v4, "size":I */
/* new-array v3, v4, [I */
/* .line 40 */
/* .local v3, "pointers":[I */
/* invoke-direct {p0, v3}, Lcom/wiyun/engine/nodes/Animation;->nativeGetFrames([I)V */
/* .line 41 */
/* array-length v6, v3 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-lt v5, v6, :cond_0 */
/* .line 45 */
/* .line 41 */
} // :cond_0
/* aget v2, v3, v5 */
/* .line 42 */
/* .local v2, "pointer":I */
/* new-instance v0, Lcom/wiyun/engine/nodes/Frame; */
/* invoke-direct {v0, v2}, Lcom/wiyun/engine/nodes/Frame;-><init>(I)V */
/* .line 43 */
/* .local v0, "f":Lcom/wiyun/engine/nodes/Frame; */
/* .line 41 */
/* add-int/lit8 v5, v5, 0x1 */
} // .end method
public native Integer getId ( ) {
} // .end method
public native void setCallback ( com.wiyun.engine.nodes.Animation$IAnimationCallback p0 ) {
} // .end method
