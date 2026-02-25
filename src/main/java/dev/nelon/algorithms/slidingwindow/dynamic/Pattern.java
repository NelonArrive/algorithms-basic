package dev.nelon.algorithms.slidingwindow.dynamic;

//  initialize left = 0
//  initialize window_state (sum, count, frequency map, etc.)
//  initialize min_or_max_result
//
//  for right from 0 to arr. length - 1:
//    update window_state to include arr[right] # Expand the window
//
//  while window_state violates the condition:
//    update min_or_max_result (if needed)
//    update window_state to exclude arr[left] # Shrink the window
//    move left pointer forward
//
//  return min_or_max_result

public class Pattern {
}
