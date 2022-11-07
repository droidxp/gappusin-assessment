public class com.wiyun.engine.nodes.MenuItemSprite extends com.wiyun.engine.nodes.MenuItem implements com.wiyun.engine.nodes.Node$IColorable implements com.wiyun.engine.nodes.Node$IBlendable {
	 /* .source "MenuItemSprite.java" */
	 /* # interfaces */
	 /* # instance fields */
	 protected com.wiyun.engine.nodes.Sprite mDisabledState;
	 protected com.wiyun.engine.nodes.Sprite mNormalState;
	 protected com.wiyun.engine.nodes.Sprite mSelectedState;
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.MenuItemSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 192 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 /* .line 193 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.MenuItemSprite ( ) {
		 /* .locals 6 */
		 /* .param p1, "normalSprite" # Lcom/wiyun/engine/nodes/Sprite; */
		 /* .param p2, "selectedSprite" # Lcom/wiyun/engine/nodes/Sprite; */
		 /* .param p3, "disabledSprite" # Lcom/wiyun/engine/nodes/Sprite; */
		 /* .param p4, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p5, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .prologue */
		 /* .line 177 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* move-object v0, p0 */
		 /* move-object v1, p4 */
		 /* move-object v2, p5 */
		 /* move-object v3, p1 */
		 /* move-object v4, p2 */
		 /* move-object v5, p3 */
		 /* .line 178 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;)V */
		 /* .line 179 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemSprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 188 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.MenuItemSprite .from ( p0 );
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .prologue */
/* .line 116 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .param p3, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 130 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 6 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .param p3, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 143 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 144 */
/* if-nez p1, :cond_0 */
/* move-object v2, v4 */
/* .line 145 */
} // :goto_0
/* if-nez p2, :cond_1 */
/* move-object v3, v4 */
} // :goto_1
/* move-object v5, p3 */
/* .line 143 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
/* .line 144 */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 145 */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, Integer p2, com.wiyun.engine.utils.TargetSelector p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 6 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .param p3, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p4, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 161 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 162 */
/* if-nez p1, :cond_0 */
/* move-object v2, v3 */
/* .line 163 */
} // :goto_0
/* if-nez p2, :cond_1 */
} // :goto_1
/* move-object v4, p3 */
/* move-object v5, p4 */
/* .line 161 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
/* .line 162 */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 163 */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, com.wiyun.engine.nodes.Node p2, java.lang.String p3 ) {
/* .locals 3 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 79 */
int v0 = 0; // const/4 v0, 0x0
/* new-instance v1, Lcom/wiyun/engine/utils/TargetSelector; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p2, p3, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,v0,v1 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 1 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 91 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,v0,p2 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( Integer p0, Integer p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 1 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p3, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 104 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,v0,p2,p3 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2 ) {
/* .locals 6 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 25 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemSprite; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v5, v4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/MenuItemSprite;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p3, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 39 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemSprite .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemSprite make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 6 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p3, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 52 */
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
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p3, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p4, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 66 */
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
/* .param p1, "includeChildren" # Z */
/* .prologue */
/* .line 230 */
/* invoke-super {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node; */
/* .line 231 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 232 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeAutoReleaseStateSprites()V */
/* .line 233 */
} // :cond_0
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 216 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 202 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 203 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 204 */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
/* .prologue */
/* .line 223 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/MenuItemSprite;->setBlendFunc(II)V */
/* .line 224 */
return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 210 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemSprite;->nativeSetColor(III)V */
/* .line 211 */
return;
} // .end method
