public class com.wiyun.engine.nodes.MenuItemSprite extends com.wiyun.engine.nodes.MenuItem implements com.wiyun.engine.nodes.Node$IBlendable implements com.wiyun.engine.nodes.Node$IColorable {
	 /* # interfaces */
	 /* # instance fields */
	 protected com.wiyun.engine.nodes.Sprite mDisabledState;
	 protected com.wiyun.engine.nodes.Sprite mNormalState;
	 protected com.wiyun.engine.nodes.Sprite mSelectedState;
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.MenuItemSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.MenuItemSprite ( ) {
		 /* .locals 6 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* move-object v0, p0 */
		 /* move-object v1, p4 */
		 /* move-object v2, p5 */
		 /* move-object v3, p1 */
		 /* move-object v4, p2 */
		 /* move-object v5, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemSprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.MenuItemSprite .from ( p0 );
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* if-nez p1, :cond_0 */
/* move-object v2, v4 */
} // :goto_0
/* if-nez p2, :cond_1 */
/* move-object v3, v4 */
} // :goto_1
/* move-object v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/nodes/Sprite; */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2, com.wiyun.engine.utils.TargetSelector p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 6 */
int v3 = 0; // const/4 v3, 0x0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* if-nez p1, :cond_0 */
/* move-object v2, v3 */
} // :goto_0
/* if-nez p2, :cond_1 */
} // :goto_1
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/nodes/Sprite; */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, com.wiyun.engine.nodes.Node p2, java.lang.String p3 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* new-instance v1, Lcom/wiyun/engine/utils/TargetSelector; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p2, p3, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,v0,v1 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,v0,p2 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,v0,p2,p3 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2 ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v5, v4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 6 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
int v4 = 0; // const/4 v4, 0x0
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2, com.wiyun.engine.utils.TargetSelector p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 6 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
private native void nativeAutoReleaseStateSprites ( ) {
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.Sprite p2, com.wiyun.engine.nodes.Sprite p3, com.wiyun.engine.nodes.Sprite p4 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void setBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.nodes.Node autoRelease ( Boolean p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeAutoReleaseStateSprites()V */
} // :cond_0
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/MenuItemSprite;->setBlendFunc(II)V */
return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeSetColor(III)V */
return;
} // .end method
