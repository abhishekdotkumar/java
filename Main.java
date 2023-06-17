public class Main {

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 6, 4, 3, 2, 1 };
    int res = findInMountainArray(3, arr);
    System.out.println(res);
  }

  public static int findInMountainArray(int target, int[] mountainArr) {
    int peakIndex = peakElement(mountainArr);
    int searchindex = -1;
    searchindex = binarySearch(mountainArr, target, 0, peakIndex);
    if (searchindex == -1) {
      searchindex =
        binarySearch(
          mountainArr,
          target,
          peakIndex + 1,
          mountainArr.length - 1
        );
    }

    return searchindex;
  }

  public static int binarySearch(
    int[] mountainArr,
    int target,
    int start,
    int end
  ) {
    boolean isAsc = mountainArr[start] < mountainArr[end];
    while (end > start) {
      int middle = (start + end) / 2;
      if (target == mountainArr[middle]) {
        return middle;
      }

      if (isAsc) {
        if (target > mountainArr[middle]) {
          start = middle + 1;
        } else {
          end = middle - 1;
        }
      } else {
        if (target > mountainArr[middle]) {
          end = middle - 1;
        } else {
          start = middle + 1;
        }
      }
    }
    return -1;
  }

  public static int peakElement(int[] mountainArr) {
    int s = 0;
    int e = mountainArr.length - 1;
    while (e > s) {
      int mid = (s + e) / 2;
      if (mountainArr[mid] > mountainArr[mid + 1]) {
        e = mid;
      } else {
        s = mid + 1;
      }
    }
    return s;
  }
}
