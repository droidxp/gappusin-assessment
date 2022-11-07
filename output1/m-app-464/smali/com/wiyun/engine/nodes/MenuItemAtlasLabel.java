public class com.wiyun.engine.nodes.MenuItemAtlasLabel extends com.wiyun.engine.nodes.MenuItem {
	 /* # direct methods */
	 private com.wiyun.engine.nodes.MenuItemAtlasLabel ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.MenuItemAtlasLabel ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* invoke-direct {p0, p2, p3, p1}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/AtlasLabel;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemAtlasLabel from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.MenuItemAtlasLabel .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( com.wiyun.engine.nodes.AtlasLabel p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
com.wiyun.engine.nodes.AtlasLabel .make ( p0,p1,p2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v1, v0, v2, v2}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemAtlasLabel .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 3 */
com.wiyun.engine.nodes.AtlasLabel .make ( p0,p1,p2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, v0, v2, p3}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemAtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2, com.wiyun.engine.utils.TargetSelector p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 2 */
com.wiyun.engine.nodes.AtlasLabel .make ( p0,p1,p2 );
(( com.wiyun.engine.nodes.AtlasLabel ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel; */
/* invoke-direct {v1, v0, p3, p4}, Lcom/wiyun/engine/nodes/MenuItemAtlasLabel;-><init>(Lcom/wiyun/engine/nodes/AtlasLabel;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.AtlasLabel p2 ) {
} // .end method
