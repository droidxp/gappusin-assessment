public class com.wiyun.engine.nodes.MenuItemAtlasLabel extends com.wiyun.engine.nodes.MenuItem {
	 /* .source "MenuItemAtlasLabel.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.MenuItemAtlasLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 104 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 /* .line 105 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.MenuItemAtlasLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "label" # Lcom/wiyun/engine/nodes/AtlasLabel; */
		 /* .param p2, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p3, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .prologue */
		 /* .line 89 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* .line 90 */
		 /* invoke-direct {p0, p2, p3, p1}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/AtlasLabel;)V */
		 /* .line 91 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemAtlasLabel from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 100 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.MenuItemAtlasLabel .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( com.wiyun.engine.nodes.AtlasLabel p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 1 */
/* .param p0, "label" # Lcom/wiyun/engine/nodes/AtlasLabel; */
/* .param p1, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p2, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 79 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2 ) {
/* .locals 3 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "map" # Lcom/wiyun/engine/nodes/CharMap; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 23 */
com.wiyun.engine.nodes.AtlasLabel .make ( p0,p1,p2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* .line 24 */
/* .local v0, "label":Lcom/wiyun/engine/nodes/AtlasLabel; */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v1, v0, v2, v2}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "map" # Lcom/wiyun/engine/nodes/CharMap; */
/* .param p3, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 38 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemAtlasLabel .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 3 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "map" # Lcom/wiyun/engine/nodes/CharMap; */
/* .param p3, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 51 */
com.wiyun.engine.nodes.AtlasLabel .make ( p0,p1,p2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* .line 52 */
/* .local v0, "label":Lcom/wiyun/engine/nodes/AtlasLabel; */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, v0, v2, p3}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2, com.wiyun.engine.utils.TargetSelector p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 2 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "map" # Lcom/wiyun/engine/nodes/CharMap; */
/* .param p3, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p4, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 66 */
com.wiyun.engine.nodes.AtlasLabel .make ( p0,p1,p2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* .line 67 */
/* .local v0, "label":Lcom/wiyun/engine/nodes/AtlasLabel; */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v1, v0, p3, p4}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeGetDisabledColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.AtlasLabel p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void nativeSetDisabledColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 114 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 115 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 116 */
} // .end method
public com.wiyun.engine.types.WYColor3B getDisabledColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 133 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 134 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;->nativeGetDisabledColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 135 */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 122 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;->nativeSetColor(III)V */
/* .line 123 */
return;
} // .end method
public void setDisabledColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 147 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;->nativeSetDisabledColor(III)V */
/* .line 148 */
return;
} // .end method
