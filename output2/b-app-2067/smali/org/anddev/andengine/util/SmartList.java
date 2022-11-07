public class org.anddev.andengine.util.SmartList extends java.util.ArrayList {
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # direct methods */
	 public org.anddev.andengine.util.SmartList ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.SmartList ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void call ( org.anddev.andengine.util.IMatcher p0, org.anddev.andengine.util.ParameterCallable p1 ) {
		 /* .locals 3 */
		 v0 = 		 (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
		 int v1 = 1; // const/4 v1, 0x1
		 /* sub-int/2addr v0, v1 */
	 } // :goto_0
	 /* if-gez v0, :cond_0 */
	 return;
} // :cond_0
v2 = (( org.anddev.andengine.util.SmartList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_1
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void call ( org.anddev.andengine.util.ParameterCallable p0 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_0 */
return;
} // :cond_0
(( org.anddev.andengine.util.SmartList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void clear ( org.anddev.andengine.util.ParameterCallable p0 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_0 */
return;
} // :cond_0
(( org.anddev.andengine.util.SmartList ) p0 ).remove ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->remove(I)Ljava/lang/Object;
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public java.lang.Object find ( org.anddev.andengine.util.IMatcher p0 ) {
/* .locals 3 */
v0 = (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // :cond_0
v2 = (( org.anddev.andengine.util.SmartList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_1
/* move-object v0, v1 */
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public java.lang.Object remove ( org.anddev.andengine.util.IMatcher p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
/* if-lt v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // :cond_0
v1 = (( org.anddev.andengine.util.SmartList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_1
(( org.anddev.andengine.util.SmartList ) p0 ).remove ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->remove(I)Ljava/lang/Object;
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public java.lang.Object remove ( org.anddev.andengine.util.IMatcher p0, org.anddev.andengine.util.ParameterCallable p1 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // :cond_0
v1 = (( org.anddev.andengine.util.SmartList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_1
(( org.anddev.andengine.util.SmartList ) p0 ).remove ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->remove(I)Ljava/lang/Object;
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public Boolean remove ( java.lang.Object p0, org.anddev.andengine.util.ParameterCallable p1 ) {
/* .locals 1 */
v0 = (( org.anddev.andengine.util.SmartList ) p0 ).remove ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/SmartList;->remove(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
} // .end method
public Boolean removeAll ( org.anddev.andengine.util.IMatcher p0 ) {
/* .locals 5 */
int v3 = 1; // const/4 v3, 0x1
int v0 = 0; // const/4 v0, 0x0
v1 = (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
/* sub-int/2addr v1, v3 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-gez v0, :cond_0 */
} // :cond_0
v2 = (( org.anddev.andengine.util.SmartList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_1
(( org.anddev.andengine.util.SmartList ) p0 ).remove ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->remove(I)Ljava/lang/Object;
/* move v1, v3 */
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public Boolean removeAll ( org.anddev.andengine.util.IMatcher p0, org.anddev.andengine.util.ParameterCallable p1 ) {
/* .locals 5 */
int v3 = 1; // const/4 v3, 0x1
int v0 = 0; // const/4 v0, 0x0
v1 = (( org.anddev.andengine.util.SmartList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/SmartList;->size()I
/* sub-int/2addr v1, v3 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-gez v0, :cond_0 */
} // :cond_0
v2 = (( org.anddev.andengine.util.SmartList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_1
(( org.anddev.andengine.util.SmartList ) p0 ).remove ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/SmartList;->remove(I)Ljava/lang/Object;
/* move v1, v3 */
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
