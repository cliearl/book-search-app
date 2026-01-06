# Book Search App

이것은 [냉동코더의 알기 쉬운 Modern Android Development 입문](https://www.inflearn.com/course/%EC%95%8C%EA%B8%B0%EC%89%AC%EC%9A%B4-modern-android?inst=c3cee510)
강의에서 제작한 앱의 소스코드 저장소입니다.

## Lecture Contents

### 섹션 0. 들어가기

- [강좌 소개](/scripts/001.md)
- [Architecture Pattern과 Android App Architecture](/scripts/002.md)
- [Support Library와 Androidx와 Jetpack](/scripts/003.md)

### 섹션 1. Android Architecture Components 이론

- [ViewBinding 기초](/scripts/011.md)
- [ViewModel과 Lifecycle 기초](/scripts/012.md)
- [LiveData와 Observer Pattern 기초](/scripts/013.md)
- [DataBinding 기초](/scripts/014.md)
- [Repository Pattern 기초](/scripts/015.md)

### 섹션 2. 책 검색 앱 만들기

- [Practice2A-앱 초기구조 작성하기 (View Binding, BottomNavigationVIew)](/scripts/021.md)
- [Practice2B-Retrofit으로 카카오 책 검색 API 다루기 (Retrofit, Moshi, OkHttp, Kapt)](/scripts/022.md)
- [Practice2C-Android App Architecture 기반 구축하기 (Repository, ViewModel, Coroutine, Livedata)](/scripts/023.md)
- [Practice2D-검색결과를 UI에 표시하기 (Coil, ListAdapter, SaveStateHandle)](/scripts/024.md)

### 섹션 3. 보강 이론

- [안드로이드의 HTTP 통신](/scripts/031.md)
- [Data class 기초](/scripts/032.md)
- [Singleton Pattern 기초](/scripts/033.md)
- [Coroutine 기초](/scripts/034.md)
- [ListAdapter 기초](/scripts/035.md)

### 섹션 4. Jetpack Navigation

- [Navigation 기초](/scripts/041.md)
- [Practice4A-Navigation으로 UI의 화면전환 구현하기 (BottomNavigationView, AppBar)](/scripts/042.md)
- [Practice4B-Safe args로 프래그먼트간 데이터 전달하기 (SafeArgs, Parcelable, WebView)](/scripts/043.md)

### 섹션 5. Jetpack Room

- [SQLite와 Room 기초](/scripts/051.md)
- [Practice5A-검색결과 저장을 위한 Room DB 구현하기 (Entity, Dao, Database, TypeConverter)](/scripts/052.md)
- [Practice5B-Room DB를 UI와 연동하기 (RecyclerView, ClickListener, SimpleCallback)](/scripts/053.md)

### 섹션 6. Kotlin Flow

- [Flow 기초](/scripts/061.md)
- [Practice6-Room 응답을 flow로 변환하기 (Flow, StateFlow, Extension functions)](/scripts/062.md)

### 섹션 7. Jetpack DataStore

- [DataStore 기초](/scripts/071.md)
- [Practice7-세팅화면 구현하기 (Preferences DataStore, Enum)](/scripts/072.md)

### 섹션 8. Jetpack Paging

- [Paging 기초](/scripts/081.md)
- [Practice8A-Room 응답에 Paging 적용하기 (Pager, PagingDataAdapter)](/scripts/082.md)
- [Practice8B-Retrofit 응답에 Paging 적용하기 (PagingSource)](/scripts/083.md)
- [Practice8C-네트워크 로딩 상태 핸들링하기 (LoadState, LoadStateAdapter)](/scripts/084.md)
- [Practice8D-RemoteMediator 적용하기 (동영상 강의 없음)](085.md)

### 섹션 9. Jetpack WorkManager

- [WorkManager 기초](/scripts/091.md)
- [Practice9-자동 캐시 정리 구현하기 (Worker, WorkRequest, WorkInfo)](/scripts/092.md)

### 섹션 10. Dagger-Hilt

- [Dependency Injection 기초](/scripts/101.md)
- [Hilt 기초](/scripts/102.md)
- [Practice10A-Hilt 의존성 작성하기 (Module, Provides, Binds)](/scripts/103.md)
- [Practice10B-Hilt 의존성 주입하기 (Inject constructor, HiltWorker)](/scripts/104.md)
- [Practice10C-관심사에 따라 ViewModel 분리하기 (by viewModels)](/scripts/105.md)

### 섹션 11. Gradle with Kotlin script

- [Build tool과 Android Gradle Plugin](/scripts/111.md)
- [Practice11-build.gradle을 KTS로 마이그레이션하기 (KTS, buildSrc)](/scripts/112.md)

### 섹션 12. 마치며

- [Modern Android Development 입문 강의를 마치며 (MAD score)](/scripts/121.md)

### Appendix. Jetpack Test

- [안드로이드 테스트 자동화 기초](/scripts/131.md)
- [PracticeA1-Local Unit Test 맛보기 (JUnit4, Truth, @SmallTest, @Before)](/scripts/132.md)
- [PracticeA2-Instrumented Unit Test 맛보기 (Runner, Roboletric, runTest, TestSuite)](/scripts/133.md)
- [PracticeA3-통합 테스트 맛보기 (Test Double, Hilt)](/scripts/134.md)
- [PracticeA4-종단간 테스트 맛보기 (Espresso)](/scripts/135.md)

## Tech Stacks

- Minimum SDK level 23

- Open-source Libraries
    - [Retrofit](https://github.com/square/retrofit)
    - [Moshi](https://github.com/square/moshi)
    - [Okhttp](https://github.com/square/okhttp)
    - [Coil](https://github.com/coil-kt/coil)
    - [Roboletric](https://github.com/robolectric/robolectric)

- [Jetpack](https://developer.android.com/jetpack)
    - [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation)
    - [Room](https://developer.android.com/jetpack/androidx/releases/room)
    - [DataStore](https://developer.android.com/jetpack/androidx/releases/datastore)
    - [Paging](https://developer.android.com/jetpack/androidx/releases/paging)
    - [WorkManager](https://developer.android.com/jetpack/androidx/releases/work)
    - [Test](https://developer.android.com/jetpack/androidx/releases/test)

- Android Architecture Components
    - [View Binding](https://developer.android.com/topic/libraries/view-binding)
    - [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle)
    - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
    - [SavedState](https://developer.android.com/jetpack/androidx/releases/savedstate)
    - [Recyclerview](https://developer.android.com/jetpack/androidx/releases/recyclerview)

- Kotlin
    - [Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
    - [Flow](https://kotlinlang.org/docs/flow.html)
    - [Kotlin serialization](https://github.com/Kotlin/kotlinx.serialization)

- [Dagger-Hilt](https://github.com/google/dagger/tree/master/java/dagger/hilt)

## MAD Score

![summary](https://user-images.githubusercontent.com/43164476/164975093-012ed589-59de-40dc-958b-f945dff8803a.png)

## Find this repository helpful?

Support it by joining [stargazers](https://github.com/cliearl/book-search-app/stargazers) for this
repository. Also, follow me on [GitHub](https://github.com/cliearl)
and [Youtube](https://www.youtube.com/channel/UC6V7LBEgcoTZUUgUU0Jv3xg)!

## License

```
Designed and developed by 2022 FrozenCoder

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
