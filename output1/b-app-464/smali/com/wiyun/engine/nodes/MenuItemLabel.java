public class com.wiyun.engine.nodes.MenuItemLabel extends com.wiyun.engine.nodes.MenuItem implements com.wiyun.engine.nodes.Node$IColorable {
	 /* # interfaces */
	 /* # direct methods */
	 private com.wiyun.engine.nodes.MenuItemLabel ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.MenuItemLabel ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* invoke-direct {p0, p2, p3, p1}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Node;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemLabel from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.MenuItemLabel .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, java.lang.String p2 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p1, p2, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemLabel .make ( p0,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.utils.TargetSelector p1 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemLabel; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1, p1}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* const/high16 v0, 0x42000000 # 32.0f */
com.wiyun.engine.nodes.Label .make ( p0,v0 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* invoke-direct {v1, v0, v2, v2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, com.wiyun.engine.nodes.Node p1, java.lang.String p2 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p1, p2, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemLabel .make ( p0,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, com.wiyun.engine.utils.TargetSelector p1 ) {
/* .locals 3 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* const/high16 v0, 0x42000000 # 32.0f */
com.wiyun.engine.nodes.Label .make ( p0,v0 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, v0, v2, p1}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 2 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* const/high16 v0, 0x42000000 # 32.0f */
com.wiyun.engine.nodes.Label .make ( p0,v0 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* invoke-direct {v1, v0, p1, p2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Label .make ( p0,p2,v0,p1 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* invoke-direct {v1, v0, v2, v2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemLabel .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 3 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Label .make ( p0,p2,v0,p1 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, v0, v2, p3}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2, com.wiyun.engine.utils.TargetSelector p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 2 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Label .make ( p0,p2,v0,p1 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* invoke-direct {v1, v0, p3, p4}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.Node p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeSetColor(III)V */
return;
} // .end method
