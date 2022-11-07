class com.naef.jnlua.util.AbstractTableMap$EntryIterator implements java.util.Iterator {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/util/AbstractTableMap; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "EntryIterator" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
/* # instance fields */
private java.lang.Object key;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TK;" */
/* } */
} // .end annotation
} // .end field
final com.naef.jnlua.util.AbstractTableMap this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.util.AbstractTableMap$EntryIterator ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.util.AbstractTableMap$EntryIterator ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap$EntryIterator;-><init>(Lcom/naef/jnlua/util/AbstractTableMap;)V */
return;
} // .end method
/* # virtual methods */
public Boolean hasNext ( ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
v1 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v1 ).getLuaState ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
v2 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v2 ).pushValue ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
v2 = this.key;
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :cond_0
int v2 = -2; // const/4 v2, -0x2
v2 = (( com.naef.jnlua.LuaState ) v1 ).next ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->next(I)Z
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.this$0;
v2 = (( com.naef.jnlua.util.AbstractTableMap ) v2 ).filterKeys ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/util/AbstractTableMap;->filterKeys()Z
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.this$0;
int v3 = -2; // const/4 v3, -0x2
v2 = (( com.naef.jnlua.util.AbstractTableMap ) v2 ).acceptKey ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/util/AbstractTableMap;->acceptKey(I)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_1
int v2 = 3; // const/4 v2, 0x3
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v1 */
} // :goto_0
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
int v0 = 0; // const/4 v0, 0x0
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public java.lang.Object next ( ) { //bridge//synthethic
/* .locals 1 */
(( com.naef.jnlua.util.AbstractTableMap$EntryIterator ) p0 ).next ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap$EntryIterator;->next()Ljava/util/Map$Entry;
} // .end method
public java.util.Map$Entry next ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map$Entry", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).pushValue ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
v0 = this.key;
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
} // :cond_0
int v0 = -2; // const/4 v0, -0x2
v0 = (( com.naef.jnlua.LuaState ) v1 ).next ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->next(I)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.this$0;
v0 = (( com.naef.jnlua.util.AbstractTableMap ) v0 ).filterKeys ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->filterKeys()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.this$0;
int v2 = -2; // const/4 v2, -0x2
v0 = (( com.naef.jnlua.util.AbstractTableMap ) v0 ).acceptKey ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/util/AbstractTableMap;->acceptKey(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_1
v0 = this.this$0;
int v2 = -2; // const/4 v2, -0x2
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).convertKey ( v2 ); // invoke-virtual {v0, v2}, Lcom/naef/jnlua/util/AbstractTableMap;->convertKey(I)Ljava/lang/Object;
this.key = v0;
int v0 = 3; // const/4 v0, 0x3
(( com.naef.jnlua.LuaState ) v1 ).pop ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* new-instance v0, Lcom/naef/jnlua/util/AbstractTableMap$Entry; */
v2 = this.this$0;
v3 = this.key;
/* invoke-direct {v0, v2, v3}, Lcom/naef/jnlua/util/AbstractTableMap$Entry;-><init>(Lcom/naef/jnlua/util/AbstractTableMap;Ljava/lang/Object;)V */
/* monitor-exit v1 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void remove ( ) {
/* .locals 2 */
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).pushValue ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
v0 = this.key;
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) v1 ).pushNil ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/LuaState;->pushNil()V
int v0 = -3; // const/4 v0, -0x3
(( com.naef.jnlua.LuaState ) v1 ).setTable ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->setTable(I)V
int v0 = 1; // const/4 v0, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
