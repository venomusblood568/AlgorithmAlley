# Problem Statement: Average Time of Process per Machine

## Table Schema

We have a table named `Activity` with the following columns:

- `machine_id` (integer): The ID of a machine.
- `process_id` (integer): The ID of a process running on the machine with ID `machine_id`.
- `activity_type` (enum): The type of activity, either 'start' or 'end'.
- `timestamp` (float): The current time in seconds when the activity occurred. The 'start' timestamp will always be before the 'end' timestamp for every `(machine_id, process_id)` pair.

`(machine_id, process_id, activity_type)` is the primary key of this table.

## Task

Write an SQL query to find the average time each machine takes to complete a process.

The time to complete a process is calculated by the 'end' timestamp minus the 'start' timestamp. The average time is calculated by the total time to complete every process on the machine divided by the number of processes that were run.

The resulting table should have the `machine_id` along with the average time as `processing_time`, which should be rounded to 3 decimal places.

Return the result table in any order.

## Example

Consider the following `Activity` table:

| machine_id | process_id | activity_type | timestamp |
|------------|------------|---------------|-----------|
| 0          | 0          | start         | 0.712     |
| 0          | 0          | end           | 1.520     |
| 0          | 1          | start         | 3.140     |
| 0          | 1          | end           | 4.120     |
| 1          | 0          | start         | 0.550     |
| 1          | 0          | end           | 1.550     |
| 1          | 1          | start         | 0.430     |
| 1          | 1          | end           | 1.420     |
| 2          | 0          | start         | 4.100     |
| 2          | 0          | end           | 4.512     |
| 2          | 1          | start         | 2.500     |
| 2          | 1          | end           | 5.000     |

Your SQL query should return the following result:

| machine_id | processing_time |
|------------|-----------------|
| 0          | 0.894           |
| 1          | 0.995           |
| 2          | 1.456           |

Explanation: 
- For `machine_id = 0`, average time is ((1.520 - 0.712) + (4.120 - 3.140)) / 2 = 0.894.
- For `machine_id = 1`, average time is ((1.550 - 0.550) + (1.420 - 0.430)) / 2 = 0.995.
- For `machine_id = 2`, average time is ((4.512 - 4.100) + (5.000 - 2.500)) / 2 = 1.456.

## Note

- The result table can be in any order.
- `processing_time` values should be rounded to 3 decimal places.
